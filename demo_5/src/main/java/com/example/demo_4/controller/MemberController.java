package com.example.demo_4.controller;

import com.example.demo_4.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;

@Controller
public class MemberController {

    // ** EntityManager를 만들어서 각 Entity를 넣을거임
    EntityManager em;

    //@GetMapping("hello")
    public Long insert(Member member){

        em.persist(member);
        return 1l;

    }

}
