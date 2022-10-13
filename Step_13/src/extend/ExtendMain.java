package extend;

public class ExtendMain {

    public static void main(String[] args){

       // Parent p1 = new Parent();

        //System.out.println(p1.str1);
        //System.out.println(p1.str2);
        //System.out.println(p1.str3);


       // p1.str1 = "홍길동";
       // p1.str2 = "임꺽정";
     //   p1.str3 = "이몽룡";


        Child c1 = new Child();
        c1.name = "홍길동";
        c1.age = 32;
        //c1.str2 = "영희";
        //c1.str3 = "민수";



       // p1.renderLee();
       // p1.renderLim();
       // p1.renderMong();


        //c1.render();
        //c1.renderLee();
        //c1.renderLim();
        //c1.renderMong();



        //System.out.println(p1.str1);
        //System.out.println(p1.str2);
        //System.out.println(p1.str3);

       c1.render(10);
       c1.render("홍길동");


    }
}
