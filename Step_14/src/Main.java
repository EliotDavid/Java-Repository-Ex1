public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int number = 10; // 4바이트

        long num = number; // 8바이트

        // 작은 거에서 큰 거로 형변환 할 때는 그냥 됨
        // 큰 거에서 작은 거로 형변환 할 때는 불가능함(물론 강제로 형변환해서 넣을 순 있는데 데이터 손실될 문제가 있음)

        float f = 3.141592f; //f까지가 숫자임 // 컴퓨터가 f까지가 숫자라고 인식을 함

        number = (int) 3.141592f; // 데이터타입이 다르기 때문에 컴파일 오류가 생김
                            // 그래서 int로 형변환 해줘야 됨

        System.out.println(number);


    }
}