package com.example.Homework_02.controller;

import com.example.Homework_02.dto.AcademyDto;
import com.example.Homework_02.dto.StudentDto;
import com.example.Homework_02.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RelationController {

    @Autowired
    private RelationService studentService;

    @GetMapping("insertInformation")
    public String index(){
        return "insertInformation";
    }

    @PostMapping("insertStudentInformation")
    public String addInformation(StudentDto dto){
        studentService.saveStudentInfo(dto);
        return "redirect:/";
    }

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
