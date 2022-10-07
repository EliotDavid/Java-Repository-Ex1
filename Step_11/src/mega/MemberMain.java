package mega;

public class MemberMain {

    //private Member m;
    //private Member m2;

    public static void main(String[] args){

        // ======================================
        // [메모리 구조 확인]
        // ======================================

        // 객체생성
        Member m = new Member(); 
        // Member m, Mememer m2는 스텍임 그리고 데이터가 new 연산자를 사용하게 되면 hip 메모리라는 곳에 이 객체가 참고하고 있는 Member 클래스 크기만큼 할당함
        //
        Member m2 = new Member(); 

        if(m == m2){
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        } // 값이 같지 않다고 나오는 이유 
          // 메서드가 호출되는 시점에 리터럴 값들을 불러옴


        
        
        // ======================================
        // [객체를 배열로 사용]
        // ======================================

        Member[] mArray = new Member[5]; // 클래스를 배열로 사용하는 개념
        // 이 코드가 Member mArray1;
                // Member mArray2;
                // Member mArray3;
                // Member mArray4;
                // Member mArray5;
                // 선언한 것과 같음(객체를 5개 만들어서 하나하나 값을 셋팅해주는 것과 같음)
                // 그래서 아래 코드는 개체별로 각각의 new를 써서 각각의 고유의 값을 대입하게 만들고 Heap에도 각각의 메모리주소를 가지게 됨(각각의 객체들이 참조하고 있는 클래스들 / 0번은 m0, 1번은 m1이라고 했을 때 m0, m1 들)
                // 대신 클래스 데이터로 생성된 객체들을 stack에 담김(heap에 있던 m0, m1 m2가 참조하고 있는 각각의 클래스들(같은 Memeber클래스여도 서로 각자 다른 객체들이기 때문에 각각의 객체의 클래스들로 생각해야됨)의 메모리주소만 불러옴)
        mArray[0] = new Member();
        mArray[0].setId("Key1");

        mArray[1] = new Member();
        mArray[1].setId("Key2");

        mArray[2] = new Member();
        mArray[2].setId("Key3");


        mArray[3] = new Member();
        mArray[3].setId("Key4");

        mArray[4] = new Member();
        mArray[4].setId("Key5");

        if(mArray[0] == mArray[1]){
            System.out.println("같음");
        } else {
            System.out.println("다름");
        } // 같은 클래스를 참조하고 있다며 메모리주소가 같다고 생각하면 안됨
          // 얘들을 new 연산자를 통해 동적할당을 해준 값이라서 각각의 저장소에 그 저장소의 각각의 메모리주소를 가지고 있음
          // 메모리주소를 같게 하려면 리터럴값을 대입해줘야함

        
        for(Member element : mArray){
            String str = element.getId();
            System.out.println(str);
        }

    }
}
