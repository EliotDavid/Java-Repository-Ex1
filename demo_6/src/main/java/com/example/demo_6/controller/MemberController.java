package com.example.demo_6.controller;

import com.example.demo_6.domain.Member;
import com.example.demo_6.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // ** 얘가 컨트롤러야 하는 어노테이션을 설정해줘야 사용할 수 있다고 함
public class MemberController {
    
    @Autowired // ** memberRepository 이 형태(MemberRepository 클래스 자체를) 들고 온다는 뜻
    private MemberRepository memberRepository; // ** 여기서 쓰러면 MemberRepository랑 연결시켜줘야한다고 함
                                               // 그래서 어노테이션을 씀
                                               // @Autowired : 그 클래스를 그대로 가지고 불러오기 위해 쓰는 기능
                                               // 대신 그 클래스에도 어노테이션이 달려져있어야함


    @GetMapping("new") // ** 어노테이션 옆()에 new를 적는건 : new 페이지를 찾아서 실행한다는 뜻이 아닌 것 같음
    public String newMember(){
        return "new";
    }

    //@GetMapping("create")
    @PostMapping("create")
    public String createMember(){

        Member member = new Member("홍길동");
        memberRepository.save(member);
        System.out.println("createMember");
        return "";
    }
}
