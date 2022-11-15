package testCase;

public class TestcaseMain {
    public static void main(String[] args){
    // P(Product) :
    // O(Order) :
    // M(Member) :

        // ** 오브젝트 A 생성
        ObjectA a = new ObjectA();

        //** 필드값 초기화
        a.setId("A");
        a.setName("홍길동");

        // ** 오브젝터 B 생성
        ObjectB b = new ObjectB();

        //** 필드값초기화
        b.setId("B");
        b.setAge(28);
        b.setName("임꺽정");
        
        // ** A 오브젝트에 B를 연결시킴
        a.setObjectB(b);

        System.out.println(a.getObjectB().getId());







        //ObjectA a = new ObjectA(); // ** A 타입의 객체를 생성
                                   // new ObjectA()가 생성자를 실행시키는 key임
                                   // 자동이라는 표현은 잘 못된 표현임. 우리가 직접 호출을 하고 있는거임.
                                   // new : 메모리를 할당해주는 연산자
                                   // Object o1 = Object(); //
                                   // Object o1 = new Object(); // 메모리 할당해줌 // 포인터가 생략되었을 뿐이지 모든 애가 포인터로 만들어지고 있다는 뜻임
                    
        
        // ** 인자값을 전달해줌
        //a.setObjectB(new ObjectB("홍길동", 34));

        // **
        //System.out.println(a.getObjectB().getName()); // ** B로 넘어가면서 그 B에 있는 필드값 중 name값을 호출해라
        //System.out.println(a.getObjectB().getAge());
        // ** 홍길동과 34가 출력되는 이유 :
        // ** 단방향


    }
}
