package org.sahil;

public class LamdaSwitchCase {
    public static void main(String[] args) {
        int x = 44;
        switch (x) {
            case 1 -> System.out.println("X is 1");
            case 2 -> System.out.println("X is 2");
            default -> System.out.println("X is other than 1, 2");
        }
    }
}

