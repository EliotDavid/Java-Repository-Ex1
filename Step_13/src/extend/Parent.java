package extend;

public class Parent {

    String name;
    //String str2;
    //String str3;


    Parent() {
        System.out.println("Parent 생성");
    }


    //void renderMong(){
    //System.out.println(str1);
    //}

    //void renderLim(){
    //System.out.println(str2);
    //}

    //void renderLee(){
    //System.out.println(str3);
    //}


    void render() {
        System.out.println(name);
    }

    void render(String str) {
        System.out.println("입력한 값은 " + str + "이고, 기본값은" + name + "입니다. 문자열입니다");


    }
}
