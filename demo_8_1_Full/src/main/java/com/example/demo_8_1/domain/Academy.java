package com.example.demo_8_1.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Academy {

    @Column(name = "academy_id")
    @Id @GeneratedValue
    private Long id;

    @Column(name = "academy_name")
    private String academyName;

    @OneToMany(mappedBy = "academy")
    private List<Member> members = new ArrayList<>();
    //private Member member;

    public void addMember(Member member){
        member.add(member);
    }

    public Academy(String academyName){
       this.academyName = academyName;
    }
}
