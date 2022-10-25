package com.example.demo_2.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller // ** MVC에서의 C임
public class DemoContorller {
    
    @GetMapping("hello") // ** hello라는 링크가 들어온다면 그 링크를 맵핑함
                        // ** 그리고 그 링크가 들어오면 이 함수가 실행이 되는 동작임
                        // ** Mapping 어노테이션은 요청(request)임
                        // ** 어노테이션 옆 링크가 들어오는 자리 : 요청이 들어오면 아래 함수가 실행 됨
    public String hello(Model model){
        // 함수이름과 위의 요청받는 링크이름은 아무 상관없지만 이름을 맞춰주는게 관행임
        // 그렇다고 해서 이름이 100% 같을 필요는 없음

        Member member = new Member();
        member.setUsername("홍길동");

        model.addAttribute("data", member.getUsername()); // ** 속성값을 전달해줄거야라는 코드

        return "hello"; // ** 이 링크가 들어오면 resources/templates/hello라는 이름을 가진 html파일을 찾아서 그걸 리턴해줌
        // ** return이 response임
    }


}
