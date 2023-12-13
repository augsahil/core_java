package org.sahil;

public class Iphone implements Phone, IOS{
    @Override
    public String processor(){
        return "A15";
    }

    @Override
    public String spaceInGb() {
        return "256GB";
    }

    @Override
    public String airDrop() {
        return "Copy and Paste anywhere.";
    }
}
