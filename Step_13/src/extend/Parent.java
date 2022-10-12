package extend;

public class Parent {

     String str1;
     String str2;
     String str3;

     
     Parent(){
         System.out.println("Parent 생성");
     }
     
     
     
    void renderMong(){
        System.out.println(str1);
    }

    void renderLim(){
        System.out.println(str2);
    }

    void renderLee(){
        System.out.println(str3);
    }

}
