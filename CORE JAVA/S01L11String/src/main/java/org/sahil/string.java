package org.sahil;

public class string {
    public static void main(String[] args) {
        String a = "sahil";//always with double quote.
        String b = "kumar";
        int c = 10;
        String d = "10000";
        System.out.println(a);
        System.out.println(a+b);//it will concate both strings.
        System.out.println(a+b+c);//c will implicitly typecasted to strings.
        System.out.println(Integer.parseInt(d));//we'll get integeral value number which is represented as string e.g. d="10000".
        System.out.println(Integer.parseInt(d)+1);
    }
}
