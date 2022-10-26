package com.example.demo_4.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

// ** JPA를 연결시켜놨기 떄문에 어노테이션을 쓸 수 있음
// ** 의존성을 추가했기 때문에 Entitiy 어노테이션이라는 걸 쓸수 있게 됨
// ** Lombok을 추가 안 하면 게터세터 어노테이션을 쓸 수 없다고 함

//@Getter @Setter
//@NoArgsConstructor // ** 기본 생성자 자동 생성
@Entity // ** 그냥 Bean이라고 하는데 무슨 뜻인지 모르겠음
//@Table(name = "Member")
public class Member {

    @Id @GeneratedValue // ** @GeneratedValue: 멤버가 여러개가 생성되어서 꽂힐 때마다 key를 자동생성해라는 어노테이션
    private long id;// ** primary key를 쓸 땐 long으로 씀 이유는 sql에서 정수를 쓸 때 long으로 쓰기 떄문이라서 그걸 맞춰주기 위함임

    @Column(name = "NAME")
    private String userName;


}
