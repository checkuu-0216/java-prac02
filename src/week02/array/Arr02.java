package src.week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        //초기화

        //배열에 특정 값 대입해서 초기화 선언
        int[] intArr = {10, 20, 30, 40, 50};
        String[] stringArr = {"a","b","c","d"};

//        //for 문을 통해서 대입
//        for(int i =0; i<intArr.length; i++){
//            intArr[i] = i;
//        }

        //다건 출력
//        for(int i=0; i<intArr.length; i++){
//            System.out.println(intArr[i]);
//        }

        for(int i: intArr){
            System.out.println(i);
        }

        //배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);
        for(int i: intArr){
            System.out.println(i);
        }
    }
}
