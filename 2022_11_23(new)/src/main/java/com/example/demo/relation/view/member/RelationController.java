package com.example.demo.relation.view.member;

import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.academy.AcademyRepository;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.service.MemberService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/members")
@RequiredArgsConstructor
@Controller
public class RelationController {
    private final MemberService memberService;
    private final AcademyRepository academyRepository;

    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) {
        return "members/newMemberForm";
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto) {

        List<Academy> all = academyRepository.findAll();
        System.out.println(all.size());


        // List<Academy> all 아무것도 없음.
        for (Academy element : all) {
            if(element.getAcademyName().equals(dto.getAcademyName())) {
                Academy academy = academyRepository.findById(element.getId());
                memberService.insert(
                        new Member( dto.getMemberName(), academy));
            }
            else
            {
                Academy academy = new Academy(dto.getAcademyName());
                memberService.insert(
                        new Member( dto.getMemberName(), academy));
            }
        }

        return "redirect:/";
    }
}
