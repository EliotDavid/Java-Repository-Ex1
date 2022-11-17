package com.example.Homework_02.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@NoArgsConstructor
@Getter @Setter
public class StudentDto {


    private String name;

    private int age;

    private String tel;

    private String email;

    //private String academyName;
}
