package org.sahil;

public class Main {
    public static void main(String[] args) {
//        Car Car = new Car();
//        System.out.println(Car.run());

        NewCar newCar = new NewCar();
        System.out.println(newCar.run());
        NewCar newCar1 = new NewCar("closed", "ON", "Seated", 10);
        System.out.println(newCar1 .run());
    }
}