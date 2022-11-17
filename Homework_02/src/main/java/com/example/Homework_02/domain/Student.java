package com.example.Homework_02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Student {
    
    // ** 객체가 순서대로 생성될 때 마다 그 객체에 ID(PK)번호를 자동으로 생성해서 부여해줌
    @Id @GeneratedValue
    private long id;

    // ** 학원은 여러 명의 학생과 연관을 맺는다
    // ** 학생의 정보로 그 학생의 학원정보도 알려면 학생의 클래스가 아카데미클래스를 가지고 있어야 한다(즉, 학생클래스가 아데미클래스를 참조하고 있어야함)
    @ManyToOne // ** Many : 학생들 to : -> One : 학원 
    private Academy academy; 

    // ** 필드 + 칼럼
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "tel")
    private String tel;

    @Column(name = "email")
    private String email;

    //@Column(name = "academy_Name")
    //academy.


    // ** 값을 받아와서 대입해줄 복사생성자 생성
    public Student(String name, int age, String tel, String email){
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }


}
