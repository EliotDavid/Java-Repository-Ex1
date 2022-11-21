package com.example.Homework_02.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@NoArgsConstructor
@Getter @Setter // ** @Data라고 쓰면 @Getter @Setter 쓸 필요없다고 함. @Data : 뭐 다 제공한다는 데 어디까지 제공하는 지 모르겠음
public class StudentDto {


    private String name;

    private int age;

    private String tel;

    private String email;

    //private String academyName;

}
