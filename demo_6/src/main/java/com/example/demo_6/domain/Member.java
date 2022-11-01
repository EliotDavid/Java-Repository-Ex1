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

@Getter //@Setter // ** 원래는 setter를 잘 안 쓴다고 함
@NoArgsConstructor // 기본 생성자를 만들어준다
@Table(name = "Member") // 지금은 Member를 소문자로 썼지만한 번씩 대문자만 쓰는 경우들이 있으면 대문자로 바꿔줘야함
                        // 테이블명을 Member로 해라라는 뜻
public class Member {
    @Id @GeneratedValue // ** @Id 어노테이션을 쓰면서 각 객체에 Id를 부여해주는데
                        // ** 여기에 @GeneratedValue까지 해주면 다음부터 생기는 객체에게 자동으로 Id를 부여해줌 
                        // ** 그리고 아이디 데이터타입이 문자열이어도 자동으로 부여해줄거라고 하는데 확실치 않음
    private long id;

    //@Column(name = "AGE") // name : 컬럼의 이름을 뭘로 지을거냐라는 뜻
    //private Integer age;
    // ** 사칙연산이 가능하냐 안 가능하냐
    // ** null 값이 대입이 가능하냐 안 가능하냐

    //@Column(name = "EMAIL")
    //private String email;

    @Column(name = "NAME")
    private String userName;

    //public Member(String userName, Integer age, String email){ // 복사 생성자

        //this.userName = userName;
        //this.age = age;
        //this.email = email;
    //}


    public Member(String userName) {
        this.userName = userName;
    }
}


// ** [영속성] : 영속성에는 4가지가 있음

// ** 영속 : Entity Manager(Container)에 포함된 상태
// ** 비 영속 : Entity Manager(Container)에 포함되기 전 상태
// ** 준 영속 : Entity Manager(Container)에 포함되었었고 현재는 포함되지 않은 상태 
// ** 삭제 : 삭제된 상태

