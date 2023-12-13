package org.sahil;

public class SamsungPhone implements Phone, Android{
    public String processor(){
        return "SD1000";
    }

    @Override
    public String spaceInGb() {
        return "256GB";
    }

    @Override
    public String whatsapp() {
        return "Send messages for free.";
    }
}
