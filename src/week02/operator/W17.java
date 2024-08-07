package src.week02.operator;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        //입력받는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력을 제외할 구구단 수 값

        // 구구단 만들기
        for (int i = 2; i <= 9; i++) {
            if (i != passNum) {
                continue; //컨티뉴를 이용해서 적는 숫자를 제외한 다른 단들을 출력
            }
            for (int j = 2; j <= 9; j++) {
    System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다");
            }
        }
    }
}
