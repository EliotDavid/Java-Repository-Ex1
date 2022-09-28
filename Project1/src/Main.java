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


            int i = 10;
            ++i;
            i++;





            

        }

    }
}