package Example;

public class ExtendMain {

    public static void main(String[] args){

        Object[] objects = new Object[5];

        int index = 0;

        objects[index] = new Teacher();
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
