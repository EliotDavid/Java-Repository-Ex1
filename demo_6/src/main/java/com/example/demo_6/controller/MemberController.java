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
    public String newMember(){ //어노테이션 옆에 new가 들어오면 new를 맵핑해서 이 함수를 호출시켜라는 의미
        return "new"; // 여기서 new를 리턴받으면 new.html로 이동을 하고
        // new.html에서 create함수로 이동하게 만들어놓은 구조라고하는데
        // create에는 지금 return이 아무것도 없어서 아무것도 안 뜨는거라고 함


    }

    //@GetMapping("create")
    @PostMapping("create")
    public String createMember(){

        Member member = new Member("홍길동", 32, "1004@heaven.mail");
        //** 홍길동의 나이정보
        //** 홍길동의 이메일정보
        //** 까지 받아서 출력하는 것

        memberRepository.save(member); // 레파지토리 안에 DB가 있음
        // 그래서 이 레파지토리가 실행이되면 알아서 DB로 쏴줌
        System.out.println("createMember");
        return "create";


    }
}
