package com.example.Homework_02.controller;

import com.example.Homework_02.dto.AcademyDto;
import com.example.Homework_02.dto.StudentDto;
import com.example.Homework_02.service.RelationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/members") // ** localhost:8080/members/main(insertStudentInformation) 이렇게 적으면 릴레이션컨트롤러에 있는걸 사용하려면 members에 있는 main(insertStudentInformation)으로 된 도메인을 가진 함수를 실행시킴
@RequiredArgsConstructor
@Controller
public class RelationController {



    @Autowired // ** @Autowired 쓸 필요없음. @RequriedArgsConstructor 쓰면 됨 : 얘가 final인 애를 final애들만 골라서 생성해줌
    // ** private final RelationService studentService;
    private RelationService studentService;

    @GetMapping("insertInformation") // ** ()안에 것도 "/new"로 바꿔줄것
    public String index(){
        return "insertInformation";
    }

    @PostMapping("insertStudentInformation") // ** 안에 것도 /new로 바꿔줄 것
    public String addInformation(@ModelAttribute("form") StudentDto dto){ // ** 여기 dto를 newMembersForm에서 "form"이라고 부를게하는 의미라고 함 
        studentService.saveStudentInfo(dto);
        return "members/newMembersForm"; // ** 여기서의 members는 templates의 members 이름의 디렉토리임
                                     // ** 그러니까 members 디렉토리 안의 newMembers로 이동해라는 뜻임
    }

    //@PostMapping("/new")
    // public String save(@ModelAttribute("form") MemberDto dto)
    //{
        //orderSerbice.insert(new Member(dto.getMemberName()));
        // return "redirect:/";
    //}

    @PostMapping("insertAcademyInformation")
    public String addInformation(AcademyDto dto){
        studentService.saveAcademyInfo(dto);
        return "redirect:/";
    }



    //@PostMapping("index")
    //public void index(){
        //;
    //}


}
