package src.week03;

public class main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성
        //초기값 기본값 확인; 초기값을 준 것은 그값이 들어가고 아닌 값은 defaolt value가 set
        double speed = car.gasPedal(100,'D');
        System.out.println("speed =" + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("패달 밝고 난 후의 car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);

    }
}
