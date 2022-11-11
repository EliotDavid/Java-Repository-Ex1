package TestcaseA;

public class TestcaseMain {
    public static void main(String[] args) {

        ObjectA objA = new ObjectA();
        ObjectB objB = new ObjectB();

        objA.getNode();
        objB.getNode();

        System.out.println(objA.getName());
        System.out.println(objB.getNode().getName());

        System.out.println(objA.getName());
        System.out.println(objB.getNode().getName());
        
        // Object obj = new Object()
        // obj.setName("홍길동").setAge(34);
        //obj.SetNode(new Object()).setName("임꺽정").setAge(28)); -> 내 안의 또 다른 내, 그러니까 복제인간을 만들어서 임꺽정이라는 애가 출력되도록 함
        
    }
}

