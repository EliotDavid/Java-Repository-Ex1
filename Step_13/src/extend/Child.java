package extend;

public class Child extends Parent{

    //public static void main(String[] args){

       // Parent obj1 = new Parent();

        //System.out.println(obj1.str2);

    //}
    int age;
    
    Child(){
        System.out.println("Child 생성");
    }

    public void render(int num){ // 부모클래스에도 똑같은 이름의 함수가 있다면 자식게 우선시 되어서 자식클래스에서 작성한 메서드 내용이 나옴
                          // 그러니까 부모로부터 상속을 받았는데 자식이 그 자산을 자기화 한거 임

        System.out.println("이름 출력");
        System.out.println("입력한 값은 " + num + "이고 정수입니다");
    }

    void render(String str){
        // ** 멤버 변수와 똑같은 이름의 지역변수를 선언

        int age = 100;

        // ** super키워드를 사용하여 부모클래스에 있는 변수에 접근가능
        // ** age 앞에 this. 를 붙여주지 않는다면 지역변수를 사용하게 된다
        System.out.println(super.name + " : " + this.age);
        System.out.println("입력한 값은 " + str + "입니다");

    }






}
