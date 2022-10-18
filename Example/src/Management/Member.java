package Management;

public class Member extends Parent{
// 이 관계는 is -a 관계임

    int Age;
    String userName;

    Group group; // 이 Mega가 소속이 될 수도 있고 회사가 될 수도 있음(어떤 그룹을 뜻함)



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
