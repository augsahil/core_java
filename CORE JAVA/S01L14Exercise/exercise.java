package org.sahil;

public class exercise {
    public static void main(String[] args) {
        // (a+b)^2 = a^2 + 2ab + b^2
        int a = 25;
        float b = 42.14f;
        double value = a*a + 2*a*b + b*b;
        int value2 = (int)(a*a + 2*a*b + b*b);


        System.out.println(value);
        System.out.println((float) value);
        System.out.println((int)value);
        System.out.println(value2);
    }
}
