package week02;

import javax.sound.midi.Soundbank;

public class W05 {
    public static void main(String[] args) {
//        변수를 바로 연산해서 그자리에서 저장하는(대입하는) 연산자
//        =(기본연산자), +=, -=,*= ...( 복합대입 연산자)
//        ++ : += 1
//        -- : -= 1

        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);

        System.out.println("-------------");
//        복합 대입 연산자
        number = 10;

        number += 2; // number = number + 2;
        System.out.println(number); // 12
        number -= 2; // number = number - 2;
        System.out.println(number); // 10
        number *= 2; // number = number * 2;
        System.out.println(number); // 20
        number /= 2; // number = number / 2;
        System.out.println(number); // 10
        number %= 2; // number = number % 2;
        System.out.println(number); // 0

        System.out.println("-------------");
//        ++ , --
//        number = number + 1; // 기본식
//        number += 1; // 약간 줄인것
        number++; // 다줄인것
        System.out.println(number);
        number--;
        System.out.println(number);

    }
}
