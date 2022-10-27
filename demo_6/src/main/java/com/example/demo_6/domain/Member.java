package com.example.demo_6.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity // ** 이렇게 넣어버리면 Controller Domain에 보면은 Entity에 들어가는 애드
        // ** Entity를 보관하는 보관소가 있는데 그걸 Entity Container라고 하는데
        // ** 그 Entity Container에서 뭘 꺼내올거냐를 묻는데
        // ** 거기서 key를 활용해서 꺼내오는데
        // ** 그거를 spring에서 뭐라고 하냐면 id라고 함
        // ** 그래서 Entity가 들어가있으면 @Id를 꼭 적어줘야함
        // ** @GeneratedValue : key를 1~10같이 (컴퓨터가?)자동으로 넣겠다는 뜻

@Getter @Setter
@NoArgsConstructor // 기본 생성자를 만들어준다
@Table(name = "Member") // 지금은 Member를 소문자로 썼지만한 번씩 대문자만 쓰는 경우들이 있으면 대문자로 바꿔줘야함
                        //
public class Member {
    @Id @GeneratedValue // ** @Id 어노테이션을 쓰면서 각 객체에 Id를 부여해주는데
                        // ** 여기에 @GeneratedValue까지 해주면 다음부터 생기는 객체에게 자동으로 Id를 부여해줌 
                        // ** 그리고 아이디 데이터타입이 문자열이어도 자동으로 부여해줄거라고 하는데 확실치 않음
    private long id;

    @Column(name = "NAME")
    private String userName;

    public Member(String userName){ // 복사 생성자
        this.userName = userName;
    }
}
