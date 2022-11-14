package com.example.demo.controller;


import com.example.demo.domain.Member;
import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    //======================================================
    // ** 생성
    @GetMapping("new")
    public String newMember()
    {
        return "new";
    }

    @PostMapping("create")
    public String createMember(@Valid MemberDto dto)
    {
        memberService.insertMember(dto);

        return "redirect:/";
    }
    //======================================================

    @GetMapping("find")
    public String find(Model model)
    {
        //model.addAttribute("object", new MemberDto());
        return "find";
    }

    @PostMapping("findName")
    public String findName(Model model, MemberDto dto)
    {
        List<Member> members = memberService.findName(dto);
        model.addAttribute("object", members);
        return "findAll";
    }

    @GetMapping("findAll")
    public String findAll(Model model)
    {
        List<Member> members = memberService.findAll();
        model.addAttribute("object", members);

        return "findAll";
    }
    @GetMapping("deleteMember")
    public String  deleteMember()
    {
        return "deleteMember";
    }

    @PostMapping("deleteMember")
    public String  deleteMember(String username)
    {
        memberService.deleteMember(username);
        return "redirect:/";
    }
}