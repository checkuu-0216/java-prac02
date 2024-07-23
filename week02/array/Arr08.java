package week02.array;

public class Arr08 {
    public static void main(String[] args) {

//        // 최대값 구하는 예시
//        int[] arr = {3, 2, 1, 5, 1};
//
//        //최대값 초기화 세팅
//        int max = arr[0];
//
//        //최대값 구하기 로직
//        for(int num: arr){
//            if(num > max){
//                max = num;
//            }
//        }


        //최소값 구하는 예시
        int[] arr = {1,4,5,9,8};

        //최소값 초기화 세팅
        int min = arr[0];

        //최소값 구하기 로직
        for(int num: arr){
            if(num<min){
                min = num;
            }
        }
        System.out.println("최솟값은 => " + min);
    }
}
