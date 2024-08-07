package src.week03.sample;

public class Main {
    public static void main(String[] args){
Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    //기본생성자가 내장되어 있기 때문에 main을 바로 선언 가능하다
//    public Main () {}

    //메서드
    public int getNumber () {
        // 지역 변수 <-> 전역변수(static)
        //해당 메서드가 실행될때 마다 독립적인 값을 저장하고 관리합니다
        // 이지역변수는 메서드 내부에서 정의 될때 생성된다.
        //이 메서드가 종료될때 소멸된다.
        int number = 1;
        number += 1; // number = number +1
        return number ;
    }
}
