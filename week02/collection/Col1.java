package week02.collection;
import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // list
        // 순서가 있는 데이터의 집합 => Array(최초 길이를 알아야함)
        //처음에 길이를 몰라도 만들수 있다!
        // Array -> 정적 배열
        //list(ArrayList) -> 동적 배열( 크기가 가변적으로 늘어난다)
        // -생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다
        // - 값이 추가될 때 더큰 공간이 필요하면 더큰 공간을 받아서 저장하니까 괜찮다


        ArrayList<Integer> intList = new ArrayList<Integer>(); //선언과 생상을 같이 함

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(1));

        // 2번째 있는 값(15)을 바꿔보자
        intList.set(1, 10);
        System.out.println(intList.get(1));

        //삭제
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println("클리어 전");
        System.out.println(intList.toString());
        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString());
    }
}
