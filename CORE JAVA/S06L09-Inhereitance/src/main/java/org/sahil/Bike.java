package org.sahil;

public class Bike extends Vehicle{
    private String handle;

    public Bike() {
        handle = "Short";
    }

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
    @Override
    public String run(){
        return "running bike";
    }
}
