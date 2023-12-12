package org.sahil;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("petrol", 2, 2, 15, "led", "short");
        System.out.println(bike);
        System.out.println(bike.run());
        System.out.println (bike.getHandle());
        System.out.println(bike.getFuelTank());
        System.out.println(bike.getEngine().toUpperCase());

    }
}