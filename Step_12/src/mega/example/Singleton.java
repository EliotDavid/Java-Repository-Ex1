package mega.example;

public class Singleton {
    //singleton(:단일아, 개체라는 뜻을 가지고 있어서 = 단일 객체를 뜻함)
    // 딱 나 하나만 있어야 하는게 단일 객체임
    // 어떤 단독 개체를 말함
    // 개체가 하나만 놓여져 사용하고 싶을 때 사용하는게 싱글톤
    // 관리자 역할은 싱글톤 기능을 사용함

    private static Singleton instance = new Singleton();
    // run타임이전에 데이터가 올라가서 new singleton이 run타임


    // static이 있으면 정적이라는 의미임
    // 정적에는 코드, 리터럴이 있음
    // 또 static도 포함됨
    // 이 static 변수는 정적 변수임
    // 동적에는 new

    // 대부분의 데이터를 private를 사용ㅇ해서 만듬
    // 여기 데이터가 static이면 사용하고자 하는 밑에 함수도 static이어야 함수가 사용가능함
    



    private Singleton(){ // 아무도 사용할 수 없게 나만 사용할 수 있게 묶어놓자라는 의미로 Singleton생성자를 만들었음
        
    }
    

    public static Singleton getInstance(){
        return instance;
    }
    // 이 static
    // 함수는 public이 되는게 기본이 되어야 함 


}
