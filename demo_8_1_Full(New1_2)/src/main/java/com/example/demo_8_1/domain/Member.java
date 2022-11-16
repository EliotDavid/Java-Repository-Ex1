package com.example.demo_8_1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;


    @Column(name = "member_name")
    private String memberName;

    @JoinColumn // 칼럼들을 서로 연결 시켜주겠다라는 뜻임
    @ManyToOne
    private Academy academy;

    public Member(String memberName, Academy academy){
        this.memberName = memberName;
        this.academy = academy;
    }

    public void add(Member member) {

    }
}
