package mega;

import mega.example.MegaExample;

public class Example {

    MegaExample test;


    String name;
    int age;
    

    Example() { // ** 얘를 기본생성자라고 함
                // ** 이걸 우리가 만들지 않아도 기본적으로 클래스가 만들어줌 
                // ** 클래스가 생성됨과 동시에 생성되면서 이 생성자가 생성되자마자 바로 호출 되는 구조임 
                // ** 클래스가 생성됨과 동시에 (생성직후) 호출된다
                // ** 얘는 클래스를 생성시키는데 목적이 있음
                // ** 생성자가 없으면 클래스를 못 만드는 구조임
                // ** 그래서 생성자라고 함

        name = "";
        age = 0;

    }


   
   

    Example(String name, int age){ // ** 이렇게 매잭변수가 포함된 생성자는 복사 생성자라고 함
        this.name = name;
        this.age = age;    // ** 이건 기본생성자라고 하지않고 일반 생성자라고함
                    // ** 기본 생성자는 위리가 생성하지 않고 클래스가 생성한 생성자 
                    // ** 기본 복사생성자 : 우리가 만들지 않은 복사생성자도 있다고 함 그걸 기본 복사생성자라고 함
                    // ** 호출시점 : 사용자가 호출한 시점에 호출됨
                    // this를 붙여주면 이 클래스 안에 멤버변수로 바로 접근해라는 뜻
                    // 생성자 또는 함수 옆에 인자 데이터타입 + 변수명 적는 부분이 그런 형태의 인자를 받을 것이라고만 생각하면 안되고 
                    // 그런 형태의 변수도 받되 또 하나의 지역변수를 선언하는 원리임
                    // 그래서 만약 멤버변수명과 지역변수명을 같게 해줄 경우에는
                    // this.name과 지역변수명(name)과 구분을 시켜줘야함
                    // this.name은 이 클래스 전역에 있는 변수중에서 name이라는 변수(필드에 있는 멤버변수)를 찾아서
                    // 그 멤버변수를 말하는거고 그냥 name은 이 메서드 안에

    }


    void output(){
        System.out.println(age);
        System.out.println(name);
    }

    void initialize(){
        name = "Example";
    }
}
