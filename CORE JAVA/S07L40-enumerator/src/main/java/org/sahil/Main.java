package org.sahil;

import java.security.PublicKey;

public class Main {


    public static void main(String[] args) {
            Learning learning= Learning.COLLECTION;
            switch (learning){
                case COREJAVA -> System.out.println("core java");
                case COLLECTION -> System.out.println("Collections");
                case GERNERICS -> System.out.println("Generics");
                case JSP -> System.out.println("JSP");
                case MULTITHREADING -> System.out.println("Multithreading");
            }

        System.out.println("getting EnumWithValues Multithreading: "+ EnumWithValues.MULTITHREADING.getI());
        System.out.println("getting EnumWithValues GERNERICS: "+ EnumWithValues.GERNERICS.getI());
    }
}