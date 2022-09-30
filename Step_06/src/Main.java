public class Main {
    public static void main(String[] args) {


        //===========================================
        //[제어문]
        //===========================================

        // ** 조건문(분기문)
        // [if], [else], [else if], [switch/case]

        {
            int number = 10;


            // 만약 number값이 100이 넘는다면? 
            // 또는 0보다 작다면 ?    
            //if(number > 100 && 0 < number) 이 공식은 성립될수 없는거라고 함
            // 이유는 number가 100보다 크면서 0보다 작을수 없기 때문임

            if (number > 100 || 0 < number) { // 100보다 크거나 또는 0보다 작다면
                System.out.println(number + "의 값이 잘못되었습니다");
            }

            if (number > 100 || 0 > number) {
                System.out.println("비정상 출력");
            } else {
                System.out.println("정상출력");
            }

            // ** if 영역과 else 영역은 서로 다른 분기로 나누어
            // 특정 조건에 맞는 영역만을 실행하게 된다


            // ** 해당 분기문은 두 영역 중 무조건 한개의 영역은 실행됨


            // ========================================

            // if문만 있는 경우는 조건에 맞으면 실행되지만
            // 조거노가 성립하지 않는 경우에는 pass 
            if (number == 10) {
                System.out.println("당첨");
            }
            // ** if else문은 if만 별도로 사용 가능하고 
            // ** else문을 따로 사용할 수 없다 

            // ** else문이 사용되기 위해서는 if문이 선행되어야 함 
            // ** else문이 사용되었다면 분기들 중 하나의 분기는 무조건 실행 된다

            //

            //int num = 5;
            if (true) {// 여기 조건식이 맞으면 밑에것들은 확인하지도 않고 이 if문 전체를 빠져나감{
                System.out.println("");
            } else if (false) {//else if는 조건식이 필요함  {
                System.out.println();
            } else {// else는 조건문식이 필요하지 않음 {
                System.out.println();
            }

            // 만약에

            // int num = 5;
            // if(num < 10){
            // System.out.println("");
            // } else if(num < 7){
            // System.out.println("");
            // } else {
            // System.out.println("");
            //} 면
            // 맨 위 조건식만 확인하고 밑에것들은 확인 안하고 바로 빠져나감

       }

        
       
       {
            //==================================
            // ** [switch/case]
            // 1. switch문의 ()자리에는 조건식이 아니라 값이 들어가는 것임
            // 2. switch = 정수 & 상수만 사용이 가능함 
           //  3. 변수이지만 final 키워드를 사용하여 상수로 만든 경우에는 사용 가능
            //==================================
            int num = 5;
            switch(num){ // 이 swtich문의 ()값 자리에는 실수를 쓰지 못함. 정수만 가능함.
                case 0 : // 그리고 여기 case 값 자리에도 변수가 값을 가지고 있다고 해서 변수를 쓰면 안되나하고 변수를 써볼까 하고 생각하는데
                         // 변수도 쓸 수 없다고 함 / 정수만 쓸 수 있음 
                         // 변수로 쓸거면 상수화 시켜서만 쓸 수 있음(예 : switch문 위에 변수를 상수화 시켜서 선언하는거 : final int one)

                    System.out.println("0번 출력");
                    break; // break : 탈출문이라고 함 // 만약 switch문에 들어있는 값이 0이라고 하면 0번 케이스에 들어가서
                            // 0번 케이스 들어있는 실행코드들을 실행하고 그 실행코드 안에 break가 들어있으니
                            // break를 만나면 break를 만나는 시점에서 이 switch문의 영역을 완전히 종료하면서(switch문의 끝의 블록으로 바로 이동하면서 이 switch문을 종료함 / 그러니 break를 만나는 시점에 아래 case들은 실행하지 않음)
                            // break가 없으면 걸리는게 없어서 프로그램동작이 아래까지 이어져 아래 케이스도 실행 됨(break가 있는 case까지 / break가 없다면 모든 case 실행 + switch문의 영역 끝까지 실행함)
                case 1 :
                    System.out.println("1번 출력");
                        switch (num){ // 이렇게 swtich문을 중첩해서 쓸수도 있음
                                      // 동작원리 : switch문 전에 선언했던 num값이 만약 1이라면
                                      // 케이스 1문으로 바로 직행해서 case1의 실행문을 실행하고 그 다음 밑의 실행코드가 switch(num)이니 중첩 switch(num)으로 들어오는데
                                    // 이 떄 switch(num)에서 num값이 switch문 이전에 선언했던 값과 일치하니 그대로 들어와서 요 중첩 switch문의 케이스 1번 으로 직행해서 case1의 실행코드를 실행하고 빠져나감
                                    // 빠져나갈 때는 어차피 스위치문 특성상 하나의 케이스만 실행하고 바로 스위치문 전체를 빠져나가기 때문에 스위치문 전체를 빠져나감
                            case 1 : 
                                System.out.println("case 1번 입니다");
                                break;
                            case 2 :
                                System.out.println("case 2번 입니다");
                                break;
                        }
                    break;
                case 2 :
                    System.out.println("2번 출력");
                    break;
                case 3 :
                    System.out.println("3번 출력");
                    break;
                default: // default : 어느 케이스에도 해당하지 않을 때 default의 실행코드가 실행됨
                         // 컴퓨터가 default로 이동할 때는 위의 case 값이 일치하는게 있는지 확인을 다 하면서 내려오면서 그러지 못 했을 때(일치하는 값이 없었을 떄 : 어차피 프로그램의 동작이 쭉 내려오고 있으니깐) 맨 마지막 default문을 만나서 실행을 함
                         // default에서는 break를 안 넣어줘도 됨 이유는 switch문에서 제일 마지막에 실행되기 때문임
                        // default : // else와 같은거임 / else도 붙여줘도 되고 안 붙여줘도 되듯이 default도 있어도되고 없어도 됨
                    System.out.println("어느 케이스에도 해당하지 않습니다");
            }
       }

    }
}
