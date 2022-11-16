package com.example.demo_8_1.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity // ** 방향성을 놓고 본다는 말은 테이블에서의 방향성이 아니라 객체상태에서의 방향성을 말하는거임
@Getter
@NoArgsConstructor
public class Academy {

    @Column(name = "academy_id")
    @Id @GeneratedValue
    private Long id;

    @Column(name = "academy_name")
    private String academyName;

    // ** 밑에 멤버 리스트랑 원투메니가 없으면 멤버는 아카데미에 접근할 수 있는데 아카데미는 멤버에 접근할 수 없는 관계가 됨
    // ** 아카데미에서 내가 몇 명을 가지고 있는 지 알고 싶으면 밑에 코드가 있어야됨(무슨말이지?)

    @OneToMany(mappedBy = "academy") // 멤버를 아카데미에 연결시켰는데 아카데미에서도 멤버에 접근할 수 있어야된다는 의미의 어노테이션 : mappedby : academy
    private List<Member> members = new ArrayList<>();
    //private Member member;


    public void addMember(Member member){
        member.add(member);
    }

    public Academy(String academyName){
       this.academyName = academyName;
    }
}
