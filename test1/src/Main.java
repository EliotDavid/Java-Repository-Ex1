public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        System.out.println("Hello world!");

        // lvalue = rvalue
        // lvalue : 좌측에 있는 벨류를 의미함
        // rvalue : 우측에 있는 벨류를 의미함

        // 변수 선언
        int number; // <- 이게 변수를 선언한 코드

        // 변수 초기화
        number = 10; // <- 변수를 초기화했다는 코드(10이란 값으로 number이란 변수에 값을 초기 저장했다라는 말)
                     // number이 변수이고 10이 상수라고 함
                     // lvalue는 흔히 변수들을 의미하고 rvalue는 10을 흔히 부른다고 함


        // 변수 선언과 동시에 값을 초기화해주는 코드
        int num = 100;

        System.out.println("number와 num의 합은 " + (number + num) + "입니다");


        // ******************************************************************
        // [자 료 형]
        // ******************************************************************

        // 수 : 양수, 음수로 나눠지고 각각 정수와 실수를 가지고 있음

        /* 자료형의 종류

        * [정수형 datatype]
        * char(캐릭터형태의 약자어임) : 문자를 나타날 때 사용을 함 / 사실 정수형이지만 문자를 표현할 때 사용함
                                  : 2byte 정수형
         숫자
        * byte : 1 byte
        * short : 2 byte
        * int : 4 byte
        * long : 8 byte


        *[실수형 datatype]
        * float : 4 byte
        * double : 8 byte

        *[논리형 datatype]
        * boolean

        */
    }
}