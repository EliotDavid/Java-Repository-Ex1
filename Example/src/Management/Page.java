package Management;

public class Page {

    public void SetData(){

        Member member = new Member(); // 이 생성은 이 함수가 종료됨과 동시에 사라짐

        //** 생성한 멤버 객체에 필드값을 셋팅한다
        member.setAge(32);
        member.setUserName("홍길동");

        {

            //** 멤버 객체와 has - a  관계인 Group class를 생성한다
            Group group = new Group();

            //** 생성된 클래스의 필드값을 셋팅한다
            group.set_class("K");
            group.setSubject("JAVA");

            //** 셋팅된 클래스를 멤버 클래스에 맵핑한다
            member.setGroup(group); // group이 member에 셋팅되는 과정
        }

        Singleton.GetInstance().setMember(member); // 이 . 이라는 애가 ~ 안에 라는 뜻보돠
                                                   // 앞에서부터 먼저 선언된 메서드부터 실행하고 
                                                   // 그 다음 이 메서드를 실행해라는 뜻으로 해석하면 됨
                                                    // 그리고(and) 라고 해석하면 됨
    }

    public Member creatMember(){
        
        return new Member();
    }

}
