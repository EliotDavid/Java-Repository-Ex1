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

    }
}
