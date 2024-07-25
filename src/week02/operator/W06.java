package src.week02.operator;

public class W06 {
    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점!!
        // ++ , --
        int a = 10;
        int b = 10;
        int val = ++a + b--; // 11 + 9 = 21 로 예상할 수 있음
        System.out.println(val); // 21
        // 대입연산자의 위치에 따라 계산이 달라짐
        //b-- 의 경우 지금 처음 식에서는 b와 다를바가 없다 그후 식을 만들면 b--된 값이 들어가게 된다.
    }
}
