package src.week03.pakageExample.main;

import src.week03.pakageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        src.week03.pakageExample.pk2.Car pkCar = new src.week03.pakageExample.pk2.Car();

        car.horn();
        pkCar.horn();
    }
}
