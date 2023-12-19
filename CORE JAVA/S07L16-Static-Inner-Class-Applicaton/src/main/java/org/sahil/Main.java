package org.sahil;

public class Main {
    public static void main(String[] args) {
        ToyotaCars toyotaCars = new ToyotaCars();
        toyotaCars.nonStaticInner.model("Corolla");
        ToyotaCars.Brand.tagLine();
    }
}