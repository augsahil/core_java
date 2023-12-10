package org.sahil;

public class UnderstandingVariable {
    public static void main(String[] args) {
        int value= 10;
        int value2 = value*10;
        float a = 9.5f;
        double b = 90.9d;
        float x = 7/3f;//it will give value with decimal
        boolean var = true;
        boolean var1 = false;
        char c = 'c';//only with single quote, error with double quote.
        char unicode = '\u00A7';
        char unicode2 = '\u0994';

        System.out.println(x);
        System.out.println(unicode);
        System.out.println(unicode2);
        System.out.println(value2);
    }
}
