public class Main {
    public static void main(String[] args) {
       //=============================================
       // [다차원 배열]
       //=============================================

        {
            int[][] numbers = new int[3][3]; //행이 3개이고 열이 3개인 배열 선언
            // 3 x 3 표를 만들었다고 생각하면 됨


            numbers[0][0] = 1;
            numbers[0][1] = 2;
            numbers[0][2] = 3;

            numbers[1][0] = 4;
            numbers[1][1] = 5;
            numbers[1][2] = 6;

            numbers[2][0] = 7;
            numbers[2][1] = 8;
            numbers[2][2] = 9;
        }


        {
            int[][] numbers = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},

            }; // 선언과 동시에 이런식으로 초기화할 수도 있음(표현방법)

            for(int i = 0; i < 3; ++i){
                for(int j = 0; j < 3; ++j){
                    System.out.println(numbers[i][j]);
                }
            }
        }

        { //  5 4 3 를 집어넣는다고 하면 원소는 3개, 4는 하나의 2차원배열이 4행으로 이뤄져있다는 것이고
            // 5는 그 2차원 배열 전체를 한 개로 보고 그 2차원 배열을 5개 만들어준다 그 뜻임
            int[][][] numbers = {
                    { // 0
                        {11, 12, 13}, // 원소들이 제일 오른쪽에 있는 []
                        {14, 15, 16}, // 그리고 이 3행이 가운데 [], 그러니
                        {17, 18,19},
                    },
                    { // 1
                      // 0   1   2
                        {21, 22, 23}, // 0
                        {24, 25, 26}, // 1
                        {27, 28, 29}, // 2
                    },
                    { // 2
                        {31, 32, 33},
                        {34, 35, 36},
                        {37, 38, 39},
                    }

            };

            System.out.println(numbers[2][2][1]); // 38을 찍을 때 좌표를 이렇게 찍어야함


        }


        {
            int[][] number1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
            };

            int[][] number2 = {
                    {0, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
            };

            for(int i = 0; i < 3; ++i){
                for(int j = 0; j < 3; ++j){
                    number2[i][j] = number1[i][j];
                }
              }

            for(int i = 0; i < 3; ++i){
                for(int j = 0; j < 3; ++j){
                    System.out.println(number2[i][j]);
                }
              }
            }


        //========================================
        //  [문자열]
        //========================================

        {
            String name1 = "홍길동"; // 앞에가 대문자라면 클래스임
            // 클래스의 내부에 name1이라는 애가 정의가 되어있는 상태임
            String name2 = "임꺽정"; // 리터럴 값
            String name3 = "홍길동";
            System.out.println(name1 == name2); // 결과값 : false

            System.out.println(name1 == name3); // 결과값 : true
            // 메모리에 또 같은 값을 등록하려 하는데 컴퓨터가 왜 또 올리려고 하냐 하면서
            // 이전에 같은 값이 등록된게 있다하면서 그 값이 들어있는 같은 메모리주소를 공유해 하면서
            // 이 String은 클래스이기때문에 참조형 데이터타입이 때문에 메모리주소를 참조하므로
            // 이 name1과 name3가 같다고 뜨는건데 값이 같다 뜨는게 아니라 메모리주소가 같아서 true가 나오는거임

            // 얘네들 같이 new연산자 없이 값을 대입해주는 것은 정적할당이라고 함
        }

        {
            String name1 = new String("홍길동"); // new 연산자를 사용해서 값을 주는 것은 동적할당이라고 함
            String name2 = new String("홍길동"); // new연산자를 쓰면 새로운 메모리주소를 생성하는 거임

            System.out.println(name1 == name2);

            // 런타임 : 프로그램이 돌아가고 있는 중
            // 정적할당과 동적할당의 기준은 런타임을 기준으로 달라짐
            // 정적할당 : 런타임 이전에 올라감
            // 동적할당 : 런타임 중에 들어감 
        }


          //==================================
          // [ 정렬 ]
          // [버블정렬]
          // ** 버블정렬: 서로 이웃한 데이터들을 비교하며 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식
          // ** 앞에서부터 바로 옆에 있는 인덱스와 비교하면서 둘 중 큰 수를 가지고 있는 인덱스의 값을 뒤로 밀어내는 방식
          // **
          // [선택정렬]
          // ** 정렬되지 않은 무작위로 추출된 난수들이 담긴 배열에서 가장 작은 데이터를 찾아 그 데이터를 가장 앞의 데이터로 보내고
          // ** 그 가장 앞에 있던 데이터를 기존의 가장 작은 데이터가 있었던 인덱스로 보내면서 
          // ** 앞에서부터 차례차례 오름차순식으로 큰 수를 넣어가는 정렬 
          // ** 가장 작은 수가 있었던 인덱스와 배열의 가장 앞의 데이터 인덱스와 교환 해나가는 방식
          //==================================

        {
            int[] numbers = new int[10];

            int index = 0;

            while (true) {

                boolean check = true;
                int num = (int) Math.random() * 100 + 1;

                for (int i = 0; i < numbers.length; ++i) {
                    if (numbers[i] == num) {
                        check = false;
                        break;
                    }

                    if (check == true) {
                        numbers[index] = num;
                        ++index;
                    }
                }

                if (index == 10) {
                    break;
                }

                for (int i = 0; i < numbers.length; ++i) {
                    System.out.println(numbers[i]);
                }

                // ======================================== 지금까지 난수 생성 완료

                // ======================================== 정렬 시작
                // <번호를 오름차순이나 내림차순 정렬할 때 원소 두개가 안 맞물리게 하나는 0번 인덱스부터 움직이게 하고 하나는 1번 인덱스부터 움직이게 해서
                // 0번 인덱스부터 움직이는 원소는 마지막 원소까지 가면 안되니 그 전 단계까지만 가게 하고 
                // 1번 인덱스부터 움직이는 원소는 마지막 원소까지 움직이게 해서 앞의 원소와 비교하게 해야함
                for (int i = 0; i < numbers.length - 1; ++i) {
                    for (int j = (i + 1); j < numbers.length; ++j) {
                        if (numbers[i] < numbers[j]) {
                            int temp = numbers[i];
                            numbers[i] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
            }
            //======================================= 정렬 끝
            //<향상된 for문 사용법>
            System.out.println("정렬된 값을 출력합니다");
            for (int element : numbers) {
                System.out.println(element);
            }
        }


        System.out.println("===============================");

            // ======= [ 숙제 : 선택정렬을 통해서 반대차순으로 정렬 한 번 해보기 ] ================
             {
                 //[버블 정렬]
                int[] numbers = new int[10];

                //[일단 배열에 난수를 저장]
                for(int i = 0; i <= numbers.length -1; ++i){
                    int num = (int) (Math.random() * 100) + 1;
                    numbers[i] = num;
                    System.out.println(numbers[i]);
                }
                // [그런 다음 버블정렬 시작]
                for(int i = 0; i <= numbers.length -1; ++i){
                    if(numbers[i] > numbers[i +1]){
                        numbers[i] = numbers[i +1];

                    }
                   // for(int i = 0; i < numbers.length -1; ++i)
                        //for(int i = 0; i < numbers.length -1; ++i)
                            //for(int i = 0; i < numbers.length -1; ++i)
                                //for(int i = 0; i < numbers.length -1; ++i)
                                    //for(int i = 0; i < numbers.length -1; ++i)
                                        //for(int i = 0; i < numbers.length -1; ++i)
                                            //for(int i = 0; i < numbers.length -1; ++i)
                }








             }



        }


    }
