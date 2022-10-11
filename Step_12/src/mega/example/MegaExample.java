package mega.example;

//import mega.example.test.MegaExampleTest;
// mega 패키지 안에 example 패키지 안에 test 패키지를 만들고 그 test패키지안에 MegaExampleTest라는 클래스를 만듬
//** 패키지 내부에 있는 클래스를 1개씩 불러올 경우

//** 해당 패키지 내부에 있는 모든 클래스를 불러올 경우

//import mega.example.test.*; : mega패키지 안에 example패키지안에 test 패키지 안에 있는 모든 클래스들을 불러와라라는 뜻

public class MegaExample {

   // MegaExampleTest test;

    /*
    Singleton s1 = new Singleton();
    Singleton s2 = new Singleton();
    Singleton s3 = new Singleton();
    // 싱글톤은 하나만 놓고 쓰고 싶은건데 이렇게 여러개가 되어버리면 메모리주소가 서로 다르다는 의미

    // 싱글톤의 생성자를 private로 묶어버리면 이 코드에서 new 연산자 옆 생성자 부분에 컴파일 오류가 뜸
     */
    
    // 그래서 아래 처럼 getInstance 메서드를 써야 한다고 함
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
}
