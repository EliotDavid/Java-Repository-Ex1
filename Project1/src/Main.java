public class Main {
    public static void main(String[] args) {

        //====================================
        // [형변환]
        // 묵시적 : 자동 형변환 (작은 것에서 큰 것으로 형변환)
        // 명시적 : 강제 형변환 (큰 것에서 작은 것으로 형변환)
        //====================================



        {
            // 묵시적 형변환
            int i = 10;
            long l = (long) i; // 이렇게 써도 되고
            // 그냥 long l = i; 해줘도 됨
            // 이유는 작은 자료형에서 큰 자료형으로 업캐스팅하는 거기 때문


            System.out.println(l);
            System.out.println(i);
        }


        {
            // 명시적 형변환
            double d = 3.141592;

            // int a = d; 이렇게 쓰면 컴파일오류가 남
            // 이유는 다운캐스팅과정인데 double은 실수형을 표현하는 자료형이면서 int보다 큰 자료형이기 때문에
            // 따라서 d가 가지고 있는 값을 a변수에 저장해서 a변수로 표기하고 싶으면(다운캐스팅하고 싶으면)
            int a = (int) d;  // 라고 코드 해줘야 됨(강제 형변환 해줘야됨)
            // 그러면 소수점 뒷자리들은 소실되고(사라지고) 앞에 정수만 a 변수에 저장되는 거임


            System.out.println(a);
         }


        {
            // 자료형에서 앞에 있는 글자가 대문자면 클래스로 만들어져있구나라고 생각하면 됨
               // String, Integer 등

            String tel = "010-0000-0000";
            System.out.println(tel);

            // int a = 3.14;
            // int b = 3f; // float이라서 컴파일 오류가 남 그래서 강제형 변환해줘야됨
            //float c = 3d; // 큰 거에서 작은 것으로 넣어주려고 하고 있기 때문에 형변환이 필요함
            // 이렇게 float c = (float)3d; // 큰 거에서 작은 것으로 넣어주려고 하고 있기 때문에 형변환이 필요함
            // double d= 3L; // 정수를 실수에 담으려고 함 // L은 long을 의미함 // double은 정수부 실수부를 모두 가지고 있어서 형변환 없이도 가능

            double a = 3.141592;
            int b = (int) a;

            System.out.println(b);
        }


        {
            //===================================
            // [연산자]
            //===================================

            // ** 산술 연산자
            // [+], [-], [*], [/], [%],

            //** 대입 연산자
            // [=]
            // 대입 연산자는 가장 후순위 연산자임


            int a = 4 + 3;
            int b = 4 - 4;
            int c = 4 * 3;
            int d = 4 / 3; // 몫을 저장함 / 뒤에 나머지들은 버리고 하나의 정수로 몫에 대해서만 저장을 함 
            int e = 4 % 3; // 나머지를 저장함


            // ** 산술 & 대입 연산자의 결합 사용
            // *산술연산자 결합
            // [+=], [-=], [*=], [/=], [%=]

            //* 비트연산자 결합
            //[&=], [|=], [^=], [<<=], [>>=], [>>>=]


            // ** 증감연산자(증감연산자라고 부르기도 하지만 단항 연산자라고도 불림)
            // 1씩 증가하거나 1씩 감소하는 연산자


            // ** 전위연산을 했느냐
            {
                int i = 0;
                System.out.println("전위연산 : " + (++i)); // 연산을 먼저 하고 출력되는 연산을 전위 연산이라고 함 
            }

            // ** 혹은 후위연산을 했느냐
            {
                int i = 0;
                System.out.println("후위연산 :" + (i++)); // 대입연산자가 사용되기 이전에 사용되는 연산자
                                                        // 출력할 거 다 출력하고 연산하는 연산자
                                                        // 그래서 프로그램이 이 코드를 만나는 시점에는 i++를 연산하지 않고 출력부터 하는 상황이기 때문에 
                                                        // 프로그램이 출력을 했을 때는 아직 i를 연산하기 전, 그러니까 기존의 i값을 출력하는 상황임
                //System.out.println("후위연산 : " + i); // 그래서 후위연산은 연산을 하는 코드도 적어주고 연산이 끝난 뒤의 코드도 작성해줘야함
            }


            {
                // ** 비교연산자
                // [>], [<], [>=], [<=], [==], [!=]

                /* // 앞에 있는 연산자가 주연산자가 되고 뒤에 있는 연산자가 대상연산자가 됨
                 * a > b  : a가 b보다 큰가?
                 * a < b : a가 b 보다 작은가?
                 * a >= b : a가 b보다 같거나 큰가?
                 * a <= b : a가 b보다 작거나 같은가?
                 * a == b : a가 b와 같은가?
                 * a != b : a가 b와 같지 않은가?
                 */


                // ** 논리 연산자
                // [&&] : and 연산자, [||] : or 연산자, [!] : not 연산자, [|] : 
                
                
                
                /*
                * [&&] = AND : 그리고 에 대한 표현 (A 그리고 B)
                   * A와 B가 둘다 true인 경우에만 성립됨
                   * 예) (10<=20) && (10>=5) = true // Booelan형으로 답을 얻음

                * [||] = OR : 또는 (A 또는 B)
                   * A와 B중에 하나만 true인 경우에도 성립이 됨
                   *  예) (10<=20) || (10<5) = true // 둘중에 하나만 true여도 true의 답을 얻음 // Booelan형으로 답을 얻음
                        
                * * [!] = NOT : 아니다 (!A)
                   * (!A) = A가 아니다
                   * (!B) = B가 아니다
                   * 예) : !(10 < 5) 10이 5보다 작은가를 비교해서 얻은 값이 false인데 거기서 !를 붙여주면서 false가 아니다의 식이 되어버리면 
                           논리적으로 반대의 논리가 되어버려서 false의 반대값인 true가 됨
                    


                * // 비트 연산의 개념(비트 연산에 대한 논리적 개념)
                * [&] : 그리고 라는 개념임
                *   01010101
                * & 01110000
                * ----------- (그러면 여기에 대한 논리적 개념이 어떻게 나오냐면)
                *
                * [|] : 또는 이라는 개념임
                *   00011101 = 29
                * | 00000111 = 7
                * -----------------
                *   00011111 = 31
                
                 */

                System.out.println(29 & 7);


                {
                    
                    // ** 비트 연산자
                    // [&], [|], [~], [^], [<<], [>>], [>>>]
                    // [&] : AND 연산자 (그리고 라는 뜻)
                    // [|] : OR 연산자 (또는 이라는 뜻)
                    // [~] : 반전 연산자 (NOT 이라는 뜻 / 말 그대로 결과의 값을 반대 시키는 연산자)
                    { // [~] 연산자의 예
                        int number = 10;
                        System.out.println(~number); // 음수는 -1부터 시작하기 때문에 양수와 달리 음수결과는 뒤로 한 값씩 밀림(2의 보수 개념을 이해해야함) 왜 반전하면 -11이 나오는지에 대한 이유임)
                        // 그래서 number의 값을 2의 보수를 해주려면 ~number +1 해주면 -10의 값이 나와짐(~는 반전 연산자이니깐 양수를 음수로 만들고 그 값을 -10으로 만드는 연산자)
                    }


                    // [^] : (XOR 연산자) : 비트가 서로 다른 상태일 때 true가 됨
                    { // [^] 연산자의 예
                        int number1 = 1;
                        int number2 = 2;
                        System.out.println(number1 ^ number2);
                        // 이게 3이 나오는 이유 : 
                        // 00000001
                        // 00000010
                        //-----------
                        //       11 = 3
                        // 1(true)과 1(true)이 만나면 false가 되어서 0이 되는 연산자
                        // 0(false)과 1(true)이 만나면 1이 되는 연산자
                    }

                    {
                        int number1 = 1;
                        int number2 = 3;
                        System.out.println(number1 ^ number2);
                        // 이 값이 2가 나오는 이유는 아래 공식과 같음
                        // 00000001
                        // 00000011
                        //----------
                        // 00000010 = 2 
                    }



                    { // xor연산자 이용의 예 (변수를 새롭게 생성하지 않고 값을 스왑)
                        int number1 = 1;
                        int number2 = 3;
                        number1 = number1 ^ number2; // 얘는 xor 연산자에 따라 2가 나옴
                        number2 = number1 ^ number2; // 2(0010)와 3(0011)이 비트연산을 함
                        number1 = number1 ^ number2; //

                        System.out.println("number1 : " + number1);
                        System.out.println("number2 : " + number2);

                    }

                    // [<<] :
                    // [>>] :
                    // [>>>]


                    // ** 삼항 연산자
                    // 1 + 2 = ? : 이항 연산자
                    // 1 + 2 + 3 = ? : 이것도 이항 연산자라고 함
                    // 이유 : 1234386 * 48945 / 134555와 같은 개념이라고 함
                    //  (1234386 * 48945) (이게 먼저 연산되고) /( 그다음 나누기 연산 들어가듯) 134555
                    
                    // 삼항연산자 : 3개의 항목이 한 번에 연산이 되어야 하는 연산자
                    // 조건식 ? true : false; -> 조건식이 맞다면 true를 반환하고 아니면 false를 반환해라
                    // A < B || A > B || A <= B의 조건식이 있다면  

                    // 만약에 A < B ? A : B; 만약에 B라는 값이 A라는 값을 절대 못 넘게 하고 싶으면

                    {
                        int x = 1000;
                        x = 100 < x ? 100 : x; // 만약에 x가 100보다 크면 100을 주는거고 아니면 x를 주는 식(이 값이 true면 앞의 값이, false면 뒤의 값이 출력)
                        System.out.println("x : " + x);
                    }


                    // ** 문자열 연산자
                    System.out.println("문자열" + "출력");


                    // 연산자의 우선순위(그냥 외우면 된다고 함)
                    // 일단 ()는 무조건 제일 우선순위로 연산되고, 대입연산자는 후선순위
                    //산술, 비교, 논리(비트단위) 연산자는 순서가 정말 중요하다고 함(교재 71페이지)


                    // ** 시프트 연산자(우리가 흔히 특정 값을 연산하려고 할 때,
                    {
                        // 컴퓨터 CPU는 마이너스 연산을 못 함 
                        //예 1)
                        // 2 - 1; 이 1을 2의 보수를 진행해서 -1로 만들어서
                        // 2 + (-1) = 1; 더하기를 진행해서 1을 만듬

                        // 5 - 10 = (-5); 인간계산 
                        // 5 + (-10) = (-5); 컴퓨터 계산

                        // 예2) image size
                        // 벡터라는 애가 있어서 x좌표와 y좌표를 잡는건데
                        // int x = 10; // 얘의 중앙값(센터값)을 구하려고 하면 얘를 2로 나누면 됨
                        // int y = 10;
                        // 나누기는 뺄셈의 연속, 곱셈은 더하기의 연속
                        // 그래도 나누기 보단 곱하기가 낫고, 빼기보다는 더하기 나음

                        // 그래서
                        // 만약 어떤 값에 절반에 해당하는 값으로 초기화를 해야 하는 경우

                        // 나누기 연산자를 사용하는 것보다 곱하기 연산자를 사용하는것이 효율적이다
                        float x = 10 * 0.5f;
                        float y = 10 * 0.5f;

                        // 곱하기 연산자를 사용하는 것보다 쉬프트 연산자를 사용하는 것이 효율적이다
                        // int a = 10 / 2;
                        int a1 = 10>>1;
                        int a2 = 10>>1;
                        // ** [<<] = *2와 같음
                        // ** [>>] = /2와 같음

                        // [>>>] : 얘는 마이너스 값으로 밀어버림(부호를 변경하려고 사용하는 연산자라고 함)
                        //000000001이라면
                        //이거를 >>>로 밀어버리면
                        //10000000이 됨
                        //마지막에 1은 넘겨버림

                    }

                }
                
            }





            

        }

    }
}