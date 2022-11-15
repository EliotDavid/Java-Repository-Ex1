package testCase;

public class ObjectA {
    
    // ObjectA의 생성자
    public ObjectA(){

    }

    // ObjectA의 복사생성자
    public ObjectA(String idA, String nameA, String idB, String nameB, int age){
        this.id = idA;
        this.name = nameA;
        this.objectB = new ObjectB(nameB, age);
    }

    //key를 하나 만듬 // 키를 id란 이름의 변수로 사용 // ObjectB에도 똑같이 만들어줘야 함
    private String id;
    private String name;


    //======================================
    // ObjectA는 ObjectB를 아래식으로 가리킬거임
    private ObjectB objectB; // ** ObjectB 클래스를 선언만 했지 인스턴스는 생성 안 해준 상태
                             // ** 인스턴스(저장공간)만 할당 안 해줬을 뿐이지, ObjectB의 성향은 가지고 있는 상태
                             // ** objectB < ObjectA 상태 ( has a 관계 상태 )
                             // A는 B에 접근할 수 있지만 B는 A에 접근할 수 없는 관계인 상태임
    public ObjectB getObjectB() {
        return objectB;
    }
    public void setObjectB(ObjectB objectB) {
        this.objectB = objectB;
    }

    //public void Initialize(){        // ** 위에 setter 없어도 이 이니셜라이즈 메서드가 실행됨
        //objectB = new ObjectB("홍길동", 34);
    //}


    // **
    //public ObjectA(){  // ** Main 클래스에서 홍길동, 34가 나오려면 ObjectA 직접 생성자가 있어야함
        //Initialize();  // ** super()가 있다고 뜨는게 아님. ObjectA클래스는 상속관계가 아닌 상태인 클래스임
                       // ** 생성자가 자동으로 실행된다는 말은 잘못된 말임
                       // ** 내가 차에 타면 시동이 걸려야되고, 다른 사람들이 타면 시동이 걸리지 않아야 되는 시스템처럼
                       // ** 내가 키가 있어야 차가 키를 인식을 하고
    //}


    //public ObjectA(String name, int age){ // 이런식으로도 콘솔창에 출력값이 안 나오는 이유는
        //objectB.setAge() = age;
        //objectB.setName() = name;
    //}

    //public ObjectA(String name, int age){ // **
        //objectB = new ObjectB(name, age);
        //}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}


