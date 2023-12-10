package org.sahil;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        System.out.println(car.run());
        car.setDoors("closed");
        car.setDriver("seated");
        car.setEngine("off");
        car.setSpeed(10);
        System.out.println(car.run());
    }
}