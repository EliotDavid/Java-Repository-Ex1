package com.example.demo.relation.domain.member;


import com.example.demo.relation.domain.academy.Academy;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "member_name")
    private String memberName;

    @JoinColumn
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Academy academy;

    public Member(String memberName) {
        this.memberName = memberName;
    }
}
