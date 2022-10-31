package com.example.demo_6.controller;

import com.example.demo_6.domain.Member;
import com.example.demo_6.repository.MemberRepository;
import com.example.demo_6.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // ** 얘가 컨트롤러야 하는 어노테이션을 설정해줘야 사용할 수 있다고 함
public class MemberController {


    @Autowired // ** 해당 객체상태를 연결시킨다라는 의미임(클래스와 클래스와 연결시켜주는게 아니라 인스턴스와 인스턴스를 연결시켜주는 의미임)
    private MemberService memberService;
    // ** 어딘가에서 객체를 생성을 해서 생성이 완료된 애를 컨테이너에 포함시켜야 됨
    // ** 객체가 생성되는 곳 : 생성 공장
    // ** 그리고 생산된 객체를 판매해야 되는 곳이 있어야되는데 팔기 전에 어딘가에 진열을 해서 담아야 되는 과정이 필요한데 

    // ** MemberService : 중간 과정
    // ** 지금까지는 Controller에서 레파지토리로 바로 넘겨줬었는데
    // 만드는 사람은 생성만 하게 하고
    // 생산을 했으면 중간에 배송을 하는 곳이 있어야 됨
    // 배송이 여러군데로 갈 수 있는데 만드는 사람이 배송까지하면 힘들어하는 것과 똑같으니깐
    // 이 배달대행을(중간과정) 어디서 해줘야되는데 그 과정을
    // Service계층에서 진행할거임

    // Controller에서 객체가 생성이 되면 안 됨(사실 컨트롤러에서 Member에 접근하면 안된다고 함)
    // 일단은 단순하게 시작하기 위해서 컨트롤러에서 Member에 접근하는 방법으로 실습을 함
    //



    //@Autowired // ** memberRepository 이 형태(MemberRepository 클래스 자체를) 들고 온다는 뜻
    //private MemberRepository memberRepository; // ** 여기서 쓰러면 MemberRepository랑 연결시켜줘야한다고 함
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
    public String createMember(Member member){

        //Member member = new Member("홍길동", 32, "1004@heaven.mail");

        //** 홍길동의 나이정보
        //** 홍길동의 이메일정보
        //** 까지 받아서 출력하는 것

        //memberRepository.save(member); // 레파지토리 안에 DB가 있음
        // 그래서 이 레파지토리가 실행이되면 알아서 DB로 쏴줌

        memberService.insertMember(member); // ** member를 생성해서 member를 전달해줌
                                            // ** 디스코드에 그림에서 칸 사이 사이에 있는 초록색 구간들이 전달해주고 받고 전달해주고 받고 하는 과정이라고 함
                                            // ** 위에서 정보를 입력하면 이제서야 service 계층에서 받아서
                                            // ** 서비스 계층에서 정보가 담긴 그 객체를 삽입시켜줌

        System.out.println("createMember");
        //return "redirect:/";
        return "create";


    }
}
