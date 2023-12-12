package org.sahil;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle() {
        engine = "petrol";
        wheels = 2;
        seats = 2;
        fuelTank = 14;
        lights = "led";

    }

    public String getEngine() {
        return engine;
    }

    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", lights='" + lights + '\'' +
                '}';
    }
    public String run(){
        return "running vehicles.";
    }
}
