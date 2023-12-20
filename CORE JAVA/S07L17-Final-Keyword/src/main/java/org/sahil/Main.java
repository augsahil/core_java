package org.sahil;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getX());
        child.setX(29);
        System.out.println(child.getX());
        System.out.println(child.finalVar);
        System.out.println(child.y);
    }
}