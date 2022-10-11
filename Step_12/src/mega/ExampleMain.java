package mega;

public class ExampleMain {
    public static void main(String[] args){
        
        Example ex1 = new Example(); // 내가 복사생성자를 사용해야 하는데 값을 넣지 않아줘서 생성자쪽에 오류가 나면
                                    // 인자값이 빈 값으로 된 생성자라도 만들어줘야 한다고 함
                                    // 직접 생성자를 하나 생성하면 기본 생성자는 없어지기 때문에 빈 값으로 된 생성자도 고의적으로 하나 만들어줘야함


        ex1.output();

        Example ex2 = new Example("홍길동", 20);
        ex2.output();

        /*
        int number;
        {
            int number; // 지역변수 특징 : 위의 number보다 얘가 우선시 됨
        }

         */


    }
    
}
