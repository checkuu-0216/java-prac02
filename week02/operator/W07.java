package week02.operator;

public class W07 {
    public static void main(String[] args) {
        //기타 연산자
        // 항변환 연산자
        int intNumber = 93 + (int) 98.8;
        System.out.println(intNumber);

        double doubleNumber = (double) 93 + 98.8;
        System.out.println(doubleNumber);

        // 삼항 연산자
        // 비교연산자와 함께 쓰인다
        //비교연산자의 결과 : true or false => 이결과의 값에 따라 결정되는 무언가
        //조건 ? 참 : 거짓
        System.out.println("----------");

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "정답" : "오답"; //x 와 y가 다르니? true
        System.out.println(s);

        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x>y)? y : x;
        System.out.println(min);
        // instance of(3주차 -> 클래스,객체)
        // 피연산자가 조건에 명시된 클래스의 객체인지 비교하여
        //맞으면 -> true
        //틀리면 -> false

    }
}
