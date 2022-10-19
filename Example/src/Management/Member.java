package Management;

public class Member extends Parent{
// 이렇게 상속 받은 관계는 is -a 관계임

    int Age;
    String userName;



    Group group; // 이 Mega가 소속이 될 수도 있고 회사가 될 수도 있음(어떤 그룹을 뜻함)
    // ** 이 Member에서 group을 가졌다는 건 has - a 관계를 말함
    // ** 이렇게 상속을 안 해줘도 내가 얼마든지 다른 클래스들을 가질 수 있음

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
       this.group = group;
   }









    public int getAge(){
        return Age;
    }
    public void setAge(int age){
        Age = age;
    }




    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
}
