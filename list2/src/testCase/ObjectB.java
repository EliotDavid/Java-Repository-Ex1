package testCase;

public class ObjectB { // B에서는 A로 참조할 수 없는 관계임 (A has B) 
                       //  - 이런 관계를 다시 말해서 B는 A를 확인할 수 없다는 관계(단방향관계)
                       // 그런데 주문에서 회원을 확인하고 싶을 때도 있으니 그럴 때는 B도 A를 가지고 있는 관계여야함 
                       // 그걸 양방향관계라고 함

    private String id;


    // ** 필드
    private String name;
    private int age;

    // ** 생성자 + 복사생성자

    public ObjectB(){

    }

    public ObjectB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ObjectB(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }


    // ** 게터 / 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // key의 게터 / 세터
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
