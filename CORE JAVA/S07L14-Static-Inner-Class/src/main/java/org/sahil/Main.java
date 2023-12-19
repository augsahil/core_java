package org.sahil;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.message();
//        Outer.message();// this is static way of referencing. we cant reference non-static method in static way.

        Outer.InnerClass.staticMessage();
    }
}