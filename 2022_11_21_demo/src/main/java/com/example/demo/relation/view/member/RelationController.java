package com.example.demo.relation.view.member;

import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.service.OrderService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/members") // ** 이렇게 해주는 이유는 도엠인 설계 구조로 만들기 위해서임 // 어떤 기능은 어디에 어떤 기능은 어디에 이렇게 나눠서 보관함
                            // ** 이 html이름이 왜 똑같아야 하냐면 /members는 실제로 template에이 있는 members와 같은 애가 아니라고함
                            // ** 근데 /members는 templates에 있는 members란 이름의 directory를 가르키는 건 맞음
                            // ** 여기에 적힌 members는 url에서만 사용하는 이름이라고 함 
                            // ** 밑에 겟멥핑에서 리턴해주는 members/newMemberForm하고는 상관없다고 함
@RequiredArgsConstructor
@Controller
public class RelationController {

    private final OrderService orderService;

    @GetMapping("/new")
    public String insert() { // ** html에 있는 form하고 이름이 같음
        return "members/newMemberForm"; // ** 만약에 html파일이 templates안에 또 다른 디렉토리를 만든 곳 안에 들어있다면 이렇게 그 디렉토리명까지 적어야한다고 함
    }

    //@GetMapping("/members/new")
    //public String insert(@ModelAttribute("form") MemberDto dto) { // ** html에 있는 form하고 이름이 같음
        // ** 근데 여기서 아직 뷰로 들어오지도 않았는데 어떻게 왜 dto를 인자로 넘기는거지?
        //return "newMemberForm";
   // }
    
    
    // ** ===== 아직 회원가입 단계이기 떄문에 학원명을 담는 건 없다고 함 // 그리고 학원명(다른 테이블임)은 그냥 이 테이블에서 연결되는 테이블이라서 이 테이블에 연결되어 학원테이블에 있는 내용이 떠야한다고 함
    @PostMapping("/members/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto) { // ** @Valid, @Validated 둘이 똑같은거라고 함 어떤걸 써도 상관없다고 함
        orderService.insert(
                new Member( dto.getMemberName()) );
        return "redirect:/";
    }
}
