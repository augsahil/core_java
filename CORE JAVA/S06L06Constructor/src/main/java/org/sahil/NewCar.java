package org.sahil;

public class NewCar {
    private String doors;
    private String engine;
    private String driver;

    public NewCar() {
        doors = "closed";
        engine = "Off";
        driver = "Away";
        speed = 0;
    }

    public NewCar(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    private int speed;

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String run(){
        if(doors.toLowerCase().equals("closed") && engine.toLowerCase().equals("on") && driver.toLowerCase().equals("seated") && speed > 0){
            return "running";
        }else {
            return "not running";
        }
    }
}
