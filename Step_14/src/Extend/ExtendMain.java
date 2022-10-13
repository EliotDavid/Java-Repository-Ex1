package Extend;

public class ExtendMain {

    public static void main(String[] args) {

        // ** [ 다형성 ]
        // ** 상속 관계에서만 사용이 가능함
        // ** 부모 클래스에서 호출 가능한 함수 없을 경우에 
        // ** 자식 클래스에 재정의된 함수가 있다고 하더라도 호출되지 않는다
        Parent p = new Child(); // Child인데 Parent것까지 가지고 있다라는 뜻으로 해석하면 되나?
        // 보기에는 Child 인스턴스를 준게 중요해보이는데 
        // 실제로 그렇지 않음
        // 제일 중요한 건 Parent 
        // 즉 데이터타입이 중요한거임
        // Parent가 없으면 Child도 없는거임 
        // 그래서 만약 Parent에 메서드를 없애면 
        
        // 형태가 현재 부모이넫 자식을 실행 시킨 코드임
        // 내 빨래를 부모님이 대신 해준것과 같고 내 방을 부모님이 대신 청소해준 것과 같고
        // 내 밥을 부모님이 대신 차려준 것과 같음
        // "대신"이라는 표현이 중요함

        // 그러니까 만약 부모님이 안 계신다면 모든 걸 대신 해줄 수 없는 구조
        
        
        p.walk(); // 를 해도 
        // 함수가 실행되지 않음 
           
        // Parent에 함수가 없으면 인스턴스를 Child를 줘도 함수가 실행되지 않음

        // p를 Child화 된 c로 넘겨줄건데
        //Child c = p; // 이렇게 하면 p가 안 넘어가서
        Child c = (Child) p; // 이렇게 되면 그냥 Child 생성자로 객체를 생성한 것과 똑같은 객체임
        c.eat();

        
        
        // ** 에러 코드(복습하기)
        Parent p1 = new Parent();

        Child c1 = (Child) p1; //  

        c1.run();

        


    }
}
