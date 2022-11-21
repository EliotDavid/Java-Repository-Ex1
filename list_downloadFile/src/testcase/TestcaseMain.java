package testcase;

public class TestcaseMain {
    public static void main(String[] args) {

        // ** 오브젝트 A 생성
        ObjectA a = new ObjectA();

        // ** 필드값 초기화
        a.setId("A");
        a.setName("홍길동");

        // ** 오브젝트 B 생성
        ObjectB b = new ObjectB();

        // ** 필드값 초기화
        b.setName("임꺽정");
        b.setAge(28);
        b.setId("B");

        // ** A 오브젝트에 B 를 연결시킴.
        a.setObjectB(b);

        System.out.println( a.getObjectB().getId() );
    }
}
