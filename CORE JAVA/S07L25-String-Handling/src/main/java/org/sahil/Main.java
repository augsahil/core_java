package org.sahil;

public class Main {
    public static void main(String[] args) {
        String a = "sahil";
        String b = "kumar";
        String c = a+b;// "+" is overloaded operator.
        String d = a.concat(b);// works fine as for c. but prefer to use this.
        System.out.println(c);
        System.out.println(d);

        if (c =="sahilkumar") {//basically here we are expecting to print sahilkumar, but it'll print sahilgupta. this is side effect of overloaded operator.
            System.out.println("sahilkumar");
        }else{
            System.out.println("sahilgupta");
        }
        if (c.equals("sahilkumar")) {//basically here we are expecting to print sahilkumar, but it'll print sahilgupta. this is side effect of overloaded operator.
            System.out.println("sahilkumar");
        }else{
            System.out.println("sahilgupta");
        }

    }
}