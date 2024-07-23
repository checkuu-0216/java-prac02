package week02.array;

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
        //Arrays.copyOf() 메서드 사용해서 복사하기
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a,a.length); //배열과 함계 length값도 같이 넣어줍니다.

        a[3] = 0;
        System.out.println(a[3]);
        System.out.println(b[3]);
    }
}
