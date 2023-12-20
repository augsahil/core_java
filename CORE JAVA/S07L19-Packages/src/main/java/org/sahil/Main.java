package org.sahil;

import org.sahil.blog.Home;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! from main");
        Home home1 = new Home();
        home1.message();

        org.sahil.store.Home home2 = new org.sahil.store.Home();
        home2.message();
    }
}