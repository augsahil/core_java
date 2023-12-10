package org.sahil;

public class SwitchCase {
    public static void main(String[] args) {
        int x = 11;
        switch (x){
            case 1:
            case 2:
                System.out.println("X is 1 or 2");
                break;
            case 3:
                System.out.println("X is 3");
                break;
            default:
                System.out.println("X is other than 1, 2, 3");
                break;
        }
    }
}

