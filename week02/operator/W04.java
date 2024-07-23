package week02.operator;

public class W04 {
    public static void main(String[] args) {
// 논리 연산자
//        비교연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 연산자
//        조건을 연결 하였을때 boolean 값들을 조합하여 참(true) 또는 거짓(false) 값인 boolean 값을 출력
//        &&(and), ||(or), !(not)

        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

//        피연산자 중 하나라도 true 라면 true 다 => ||
        System.out.println("-------------------");
        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);

//        피연산자가 모두 true 면 true => &&
        System.out.println("-------------------");
        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag3);
        System.out.println(flag1 && flag2 && flag3);

//        and
        System.out.println("-------------------");
        System.out.println((5 > 3) && (3 > 1)); //true && true => true
        System.out.println((5 > 3) && (3 < 1)); //true && false => false

//        or
        System.out.println("-------------------");
        System.out.println((5 > 3) || (3 > 1)); // true || true => true
        System.out.println((5 > 3) || (3 < 1)); // true || false => true
        System.out.println((5 < 3) || (3 < 1)); // false || false => false

        // System.out.println(1<3<5); 불가능! 한번에 이어서 비교하는건 불가능 하다

//        논리 부정 연산자 (! : not)
        System.out.println("-------------------");
        System.out.println(!flag1);
        System.out.println(!flag3);
        System.out.println(!(flag1 && flag3));
        System.out.println(!(5==5));
        System.out.println(!(5==3));
    }
}
