public class Main {
    public static void main(String[] args) {
        //===================================================
        // ** [반복문]
        //===================================================

        {
            // [for]
          /*
          for(초기문; 조건문; 증감문){
                반복될 내용
           }
           */

            // ** 1. 각 초기문, 조건문, 증감문은 [;](세미콜론)으로 구분됨
            // ** 2. 초기문 : int i = 0; 과 같이 사용할 변수를 초기화 하는 내용
            // 이 i는 for문 영역 안에서 선언한 i 임
            // ** 3. 조건문 : (i < 10)과 같이 조건이 true인 동안 반복됨
            // *    현재 i가 0 이고 10보다 작기 때문에 반복조건에 맞음
            // ** 4. 증감문 : ++i, i++, --i, i-- 와 같이 증가하거나 감소하는 내용


            for (int i = 0; i < 10; ++i) { // 중첩 반복문
                System.out.println(i);
                for (int j = 0; j < 10; ++j) {
                    System.out.println(i + ", " + j);
                }
            }
        }

          // 중첩 반복문을 사용해서 구구단을 만들어 봄
          for(int i = 2; i < 10; ++i){
              System.out.println("[" + i + "] 단");
              for(int j = 1; j < 10; ++j){
                  System.out.println(i * j);
              }
          }



          // ** [while문]
          /*
          * 초기문
          *
          * while문(조건식){ // while에는 조건문만 들어감
          * 증감문
          * 반복될 내용
          *  }
           */
            
            {
                int i = 0;
                while(i < 10){
                    i++;
                    System.out.println(i);
                }
            }

            {
                int i = 0;
                while(i < 10){
                    System.out.println(i++); // 값 자리에 증감문 사용 가능
                }
            }

            { // ** 보통 언제 끝날지 그 끝을 알 수 없는 경우에 사용됨
                int count = 0;
                int max = 10;
                while (true) {
                    System.out.println((++count) + " 반복됨. (" + max + ")");

                    if (count % 2 == 0) {
                        max++;
                    }

                    if (count > max) {
                        break;
                    }
                }
            }



            {
                // 중첩 while문 사용으로 구구단 만들기
                int i = 2;

                while (true) {
                    int j = 0;
                    while (true) {
                        System.out.println(i + " * " + j + " = " + i * j);
                        ++j;

                        if (j > 9) {
                            break;
                        }

                    }

                    if (++i > 9) {
                        break;
                    }

                }
            }
                 
                 // ** [do ~ while] : 조건이 성립되지 않더라도 무조건 1회는 실행됨
                 /* 
                 * 초기문

                    do{
                      반복될 내용
                    } while(조건식)
                 */

                {
                    int a = 0;
                    do{
                        System.out.println(a++);
                    } while(false);

                    while(a < 0){ // while 값이 false면 당연히 실행코드를 실행시키지 못한다는 컴파일 오류가남
                        System.out.println("홍길동");
                    }
                }


                // ** 특정 짝수단수/ 홀수단수를 제외한 구구단만 출력하고 싶다 하면 continue를 만들어야함
                //=======================숙제======================

                {
                    for(int i = 2; i < 10; ++i){
                        System.out.println("[ " + i + " 단 ]");
                        if(i%2==0){
                            System.out.println(i + "단은 짝수단수의 구구단입니다");
                        }else if(i%2==1){
                            System.out.println(i + "단은 홀수단수의 구구단입니다");
                        }
                        for(int j = 1; j < 10; ++j){
                            System.out.println(i + "*" + j + " = " + (i*j));
                            if((i*j)%2==0){
                                System.out.println((i*j) + "는 짝수입니다");
                            } else if((i*j)%2==1){
                                System.out.println((i*j) + "는 홀수입니다");
                            }
                        }
                    }
                }


            }

        }


