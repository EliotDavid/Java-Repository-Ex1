package com.example.Homework_02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.management.relation.RelationService;
import javax.transaction.Transactional;


@Controller
public class RelationController {

    //@Autowired
    //private

    @GetMapping("index")
    public String index(){
        return "redirect:/";
    }

    //@PostMapping("index")
    //public void index(){
        //;
    //}


}
