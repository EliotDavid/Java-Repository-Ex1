package Example;

import java.io.ObjectStreamException;

public class ExtendMain {

    public static void main(String[] args){
        //=======================================
        ParentA a = new Object();
        a.parentA();

        ParentB b = new Object();
        b.parentA();
        b.parentB();

        System.out.println("a > ParentA : " + (a instanceof ParentA)); //
        System.out.println("a > ParentA : " + (b instanceof ParentA));
        System.out.println("a > ParentA : " + (b instanceof ParentB));





        //==============================================



        /*
        //**  [추상클래스]
        //Object o = new Object(); Object가 추상클래스이기 때문에 이 코드가 컴파일 오류 나는 게 정상임
        // ** abstract를 사용한 클래스는 스스로를 생성하는 것이 불가능 



        // ** 부모클래스가 추상클래스인 경우 상속관계에 있는 클래스를 항상 할당하여 사용한다

        //Parent[] objects = new Parent[2]; //라고 쓸 수 없음
        Object[] objects = new Object[2];
        objects[0] = new Student("홍길동");
        objects[1] = new Teacher("임꺽정");

        //Object student1 = new Student(); // 이걸 못 쓰는 이유는 추상 클래스에 인자값이 없는 생성자를 설정해주지 않았기 때문임
                                         // 직접 생성자를 써줘서 기본생성자를 따로 만들어줘야 함
        objects[0].render();
        objects[1].render();




         */






        // =================================================
        // [아래 코드는 다형성 개념에 따른 각각의 객체가 각각의 데이터와 부모함수를 한 번만 실행시켜도 각각 다른 결과가 나오는 걸 설명하는 코드임]
        /*
        Object[] objects = new Object[5]; // 길이를 넘겨준거고

        int index = 0;

        objects[index] = new Teacher(); // 생성자 호출되었다는 건, 클래스가 생성되었다는 뜻
        objects[index].index = index;
        objects[index].name = "고길동";
        objects[index].age = 48;
        objects[index]._class = "K 강의실";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "임꺽정";
        objects[index].age = 38;
        objects[index]._class = "K 강의실";
        ++index;


        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "이몽룡";
        objects[index].age = 35;
        objects[index]._class = "K 강의실";
        ++index;


        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "성춘향";
        objects[index].age = 17;
        objects[index]._class = "K 강의실";
        ++index;


        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "장대길";
        objects[index].age = 27;
        objects[index]._class = "K 강의실";
        ++index;

        for(int i = 0; i < objects.length; ++i){
            objects[i].render();
        }


        /*
        Object std1 = new Student();

        std1.index = 1;
        std1.name = "홍길동";
        std1.age = 32;
        std1._class = "K 강의실";


        std1.render();

        Object tch1 = new Teacher();

        tch1.index = 0;
        tch1.name = "고길동";
        tch1.age = 48;
        tch1._class = "K 강의실";

        tch1.render();


         */

    }
}
