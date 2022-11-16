package com.example.demo_8_1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity // 엔티티도 객체이니깐 방향성은 객체상태일 떄이만 생기는거임
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;


    @Column(name = "member_name")
    private String memberName;

    @JoinColumn // 칼럼들을 서로 연결 시켜주겠다라는 뜻임
    @ManyToOne // 학생은 여러명이고 그 여러명의 학생이 학원이라는 한 곳에 다니니깐 Many to One
                // 아래 학원은 여러명의 학생을 받는다는 뜻
                // 멤버 안에 아카데미가 있으니깐 멤버에서 아카데미를 확인할 수 있다는 의미
    private Academy academy;

    public Member(String memberName, Academy academy){
        this.memberName = memberName;
        this.academy = academy;
    }

    public void add(Member member) {

    }
}
