public class Main {
    public static void main(String[] args) {

        System.out.println("버블 정렬 공부");

        int temp;
        int[] numbers = new int[7];

        for(int i = 0; i < numbers.length; ++i){ // 일단 무작위의 난수 배열을 한 번 만들어 본다
            int num = (int) (Math.random() * 100) +1;
            numbers[i] = num;
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < numbers.length -1; ++i){ // 그리고 나서 일단 이 배열 속에 중복된 번호가 있는지 체크한다
            for(int j = 1; j < numbers.length; ++j){ // if문 위에 while(true)를 넣어야되나?
                if(numbers[i] == numbers[j]){
                    numbers[j] = (int)(Math.random() * 100) +1;
                    }
                }
            }

        System.out.println(numbers);

        }

        



    }
