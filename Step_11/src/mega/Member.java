package mega;

public class Member {

    // ** 멤버변수(인스턴스 멤버변수) 선언
    // ** 아래 멤버변수는 모두 클래스로 생성됨
    // ** 앞이 대문자인거는 모두 클래스임
    
    // 만약 멤버변수 앞에 접근제한자를 public을 썼을 때
    // 직접적으로 접근가능
    // private로 해줬을 경우 직접적으로 접근 못함
    
    // 아래처럼 데이터와 함수가 하나로 있는 것을 캡슐화라고 함
    
    // [데이터]
    private String id;
    private String userName;
    private Integer age;

    // 아래방법은 객체 지향적인 방법과 DB처리 방법에 똑같이 있으나 방법이 서로 다르다고 함
    // 생성 
    // 변경
    // 갱신
    // 삭제
    //public void Initialize(); // 초기값을 설정한다는 메서드
    //public void progress(); // 변경한다는 메서드
    //public void update(); // 업데이트하는 메서드
    //public void delete(); // 삭제하는 메서드




    // Getter & Setter가 있음
    // Getter 함수 : 참조만 가능하게 함
    // Setter 함수 : 변경만 가능함

    // 필드 : 함수코드를 제외한 모든 공간



    //[함수]
    public String getId() {return id;}
    public void setId(String id){this.id = id;}

    public String getUserName() {return userName;}
    public void setUserName(String userName){this.userName = userName;}

    public Integer getAge() {return age;} // 내가 얘의 값을 갖고 오겠다
    public void setAge(Integer age){this.age = age;} // 내가 얘의 값을 변경하겠다는 방법임


    //public Member createMember(){
        //Member m = new Member();

        //m.setId();
        //m.setUserName();
        //m.setAge();

        //return m;
    //}


}
