package com.example.demo_8_1.domain;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional(readOnly = true) // 무조건 읽기전용으로만 쓰겠다라는 뜻
@Controller
public class RelationController {

    @PersistenceContext // 컨트롤러에는 원래 펄시스트컨텍스트를 안 씀 // 편의사항 떄문에 씀
    private EntityManager em;

    @Transactional
    @GetMapping("main") 
    public String insert(){

        // 회원가입할 떄 주소가 될 수 있고, 전화번호가 될 수 있음. 그리고 서비스로 넘김.
        // 그리고 오더서비스에서 멤버랑 아카데미를 연결시켜줘야함(멤버랑 아카데미를 다 넣어줘야함)

        Academy academy1 = new Academy("메가스터디컴퓨터학원");
        Academy academy2 = new Academy("부산컴퓨터학원");
        Academy academy3 = new Academy("서면컴퓨터학원");

        Member member = new Member("홍길동", academy1);
        // =============================================
        // 위에는 객치제향이고
        // =============================================
        // 아래는 sql임

        //academy2.addMember(member); // 아카데미에서 멤버를 확인하려고 적은 코드

        // 아카데미(쇼핑몰)는 여러 교육과목들을 가지고 있고 그 교육과목(상품)들을 이용하는 고객들(학생들)이 있음

        em.persist(member);
        em.persist(academy1); // 얘가 CRUD임

        return "redirect/";
    }


}
