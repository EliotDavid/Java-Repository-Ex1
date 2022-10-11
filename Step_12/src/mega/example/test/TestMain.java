package mega.example.test;

public class TestMain {


    public static void main(String[] args){
        // 서로 다른 메모리 주소를 가지고 있음
        // 리터럴 값을 저장해주면 같은데
        // 이렇게 new 연산자를 써서 대입해주는 건 서로 메모리주소가 다름
        // 왜 다른지 Stack이랑 Heap 영역에 저장되고 메모리주소 어쩌고 하는 그 원리(필기) 다시 찾아서 이해하기
        MegaExampleTest test1 = new MegaExampleTest();
        MegaExampleTest test2 = new MegaExampleTest();
        MegaExampleTest test3 = new MegaExampleTest();


    }

}
