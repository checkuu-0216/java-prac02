package week02;

public class W16 {
    public static void main(String[] args) {
//        int number = 0;
//        while (number <3) {
//            number++;
//            System.out.println(number+"출력");
//
//        }

        //do ~ while
//        int number = 4;
//        do{
//            // 이로직을 먼저 수행후 while 돌리겠다
//            System.out.println(number + "출력");
//        }while(number <3);

        //break (깨부수다)
        //가장 가까운 블록의 for문 또는 while, switch문을 중단!
//        int number = 0;
//        while (number < 3) {
//            number++;
//            if (number ==2){
//                break;
//            }
//            System.out.println(number + " 출력");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//            if (i == 2) {
//                break;
//            }
//            for (int j = 0; j < 10; j++) {
//                System.out.println("j = " + j);
//                if (j == 2) {
//                    break;
//                }
//            }
//
//        }

        // countinue
        int number = 0;
        while (number <3 ) {
            number ++;
            if (number ==2 ){
                continue; // 바로 다음으로 넘어간다 number==2 일때 하위 로직을 뛰어넘고 바로 다음으로
            }
            System.out.println(number + "출력");
        }
    }
}
