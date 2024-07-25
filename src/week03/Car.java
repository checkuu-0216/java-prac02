package src.week03;

public class Car {

    /* 필드 영역 */
    //고유 데이터
    String company; // 자동차 회사
    String model; // 자동차 모델
    String color; //자동차 색
    double price; //자동차 가격

    // 상태 데이터 영역
    double speed; // 자동차 속도, km/h
    char gear; // 기어상태 (P ,R ,N ,D)
    boolean lights; // 자동차 조명의 상태

    //객체 데이터 영역
    Tire tire;
    Door door;
    Handle handle;

    /*생성자 : 처음 객체가 생성될 때 어떤 로직을 수행해야 하며 , 어떤 값이 필수로 들어와야 하는지 정의*/
    public Car () {}

    /* 메서드 영역 */

    //gasPedal
    //input kmh
    //output speed
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    //brakePedal
    //input x
    //output speed
    double brakePedal(){
        speed = 0;
        return speed;
    }

    //changeGear
    //input gear(char type)
    //output gear
char changeGear (char type) {
        gear = type;
        return gear;
}
    //onOffLight
    //input x
    //output lights(boolean)
boolean onOffLights () {
        lights = !lights;
        return lights;
}
    //horn
    //input x
    //output x
    void horn () {
        System.out.println("빵빵!");
    }
}
