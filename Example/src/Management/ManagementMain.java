package Management;

public class ManagementMain {

    public static void main(String[] args) {

        // ** [상속이랑 인터페이스의 차이]
        // ** 인터페이스로 만들어진 클래스는 반드시 인터페이스에서 만들어진 함수들이 포함이 될 수 밖에 없는데
        // 상속은 포함을 안 시켜도 됨

        // ** 어플리케이션이나 게임개발에서는 인터페이스를 왜 쓰고
        // ** 웹 개발에서는 왜 인터페이스를 써도되고 안 써도 되냐면
        
        // ** 인터페이스로 프로젝트를 진행한다는 말은 직렬로 작업을 한다는 뜻
        // 왜냐면 인터페이스를 누가 던져주면 그 틀(인터페이스의 함수명)에 맞게 
        // 각자의 역할을 분담해서 각자 혼자서 그 맡은 역할을 진행하면 됨
        
        // ** 상속으로 프로젝트를 진행한다는 말은 병렬로 작업한다는 뜻 
        // 상속은 한 명 한 명의 함수를 상속 받아서 사용하기 떄문에 
        // 그 함수를 그대로 계속 참고해서 이용하기 떄문에와 중간에 작업에 수정사항이 있으면
        // 그 함수 내용을 바꾸면서 작업을 해야되기 때문에
        // 상속관계로 작업을 하고 있고 있기 때문에 신중해야함
        
        //=========================================================
        // ** 인터페이스 클래스에서 상속을 받은 함수는 무조건 인터페이스 클래스에서 상속 받은 클래스에서 함수를 정의해야 되는게 룰임
        // ** 인터페이스에서는 함수를 정의를 안 해주면 빌드(실행) 자체가 안 되고 수정하라고 컴파일 오류만 남 
        // ** 상속은 함수를 꼭 정의 해 주지 않아도 프로그램이 실행 됨
        //=========================================================


        // ** 멤버 객체를 생성한다 
        Member member = new Member();
        
        //** 생성한 멤버 객체에 필드값을 셋팅한다
        member.setAge(32);
        member.setUserName("홍길동");

        //** 멤버 객체와 has - a  관계인 Group class를 생성한다
        Group group = new Group();
        
        //** 생성된 클래스의 필드값을 셋팅한다
        group.set_class("K");
        group.setSubject("JAVA");

        //** 셋팅된 클래스를 멤버 클래스에 맵핑한다
        member.setGroup(group);

        //member.setGroup(new Group());


        // ** 멤버의 필드값을 받아온다
        String name = member.getUserName();
        int age = member.getAge();
        String _class = member.getGroup().get_class();
        String subject = member.getGroup().getSubject();

        // ** 출력한다
        System.out.println(name + " : " + age + " [" + _class + "]" + subject);



        // ** 싱글톤은 단 하나만 만들어서 어디서든 접근가능하게 만든 클래스








    }
}
