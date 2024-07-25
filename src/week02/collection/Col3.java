package src.week02.collection;
import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        // stack
        //수직으로 값을 넣어놓고 뺀다 FILO (firstIn lastOut)
        //push, peek, pop
        //최근 저장된 데이터를 나열하고 싶거나 , 데이터의 중복처리로 막고 싶을 때 사용

        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while(!intStack.isEmpty()){
            System.out.println(intStack.pop()); //가장 늦게 들어간 데이터가 나온다

        }

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //peak
        System.out.println(intStack.peek());
        System.out.println(intStack.size());
    }
}
