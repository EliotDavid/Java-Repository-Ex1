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

        Academy academy1 = new Academy("메가스터디컴퓨터학원");
        Academy academy2 = new Academy("부산컴퓨터학원");
        Academy academy3 = new Academy("서면컴퓨터학원");

        Member member = new Member("홍길동", academy1);

        em.persist(member);
        em.persist(academy1);

        return "redirect/";
    }


}
