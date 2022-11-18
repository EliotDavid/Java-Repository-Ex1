package com.example.Homework_02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class Academy {


    @OneToMany(mappedBy = "academy") // ** 1(이 클래스):N(학생들) 관계
                                     // ** 아래 객체는 Academy타입으로 만들어진 객체, academy와 연결된다
    private List<Student> students = new ArrayList<>();

    @JoinColumn
    @Column(name = "academy_Id")
    @Id @GeneratedValue // ** 아카데미에 대한 ID(아카데미의 주키)
    private long id;



    @Column(name = "academy_Name")
    private String academyName;

    // ** 학원이름을 받아올 복사생성자 생성
    public Academy(String academyName){
        this.academyName = academyName;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }



}
