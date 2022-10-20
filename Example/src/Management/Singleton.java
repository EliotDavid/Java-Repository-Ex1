package Management;

public class Singleton {
    static private Singleton instance = null; // static이라는 애는 정적이라는 애라서(어디가지 않고 가만히 있어서 어디서든 접근이 가능한 그런 개념으로 이해하면 됨)
                                              // 어디서든 접근 가능하게 만들기 위한 접근제한자
                                              // instance : 그냥 변수이름임

    static public Singleton GetInstance() {
        if (instance == null)
            instance = new Singleton(); // 처음에 한 번만 들어오고 그 다음부터는 아래 return instance만 실행됨 
            return instance; // 얘는 else문에 있는 코드임 
                             // 그래서 결과적으로 얘(instance)가 이 Singleton 클래스 전체를 말함

    }

    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }



    private Singleton() {};// 여러개의 인스턴스랑 여러개의 동일한 변수명으로 지어지는 걸 막기 위해 생성자에 private 씀
}
