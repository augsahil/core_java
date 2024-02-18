package org.sahil;

import org.sahil.laptop.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getScreen());
        System.out.println(laptop.getProcessor());
        System.out.println(laptop.getProcessor().getBrand());

    }
}