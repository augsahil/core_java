package org.sahil;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.doSomething();
        } catch (ZeroException e) {
            e.printStackTrace();
        }
    }
    public void doSomething() throws RuntimeException, ArithmeticException, ZeroException{// we can throw multiple exceptions.
        String x = "Two";
        if(x.equals("zero")){
            throw new RuntimeException();//unchecked exception---- these are not serious type exception
        } else if (x.equals("one")) {
            throw new ArithmeticException();//unchecked exception
        }else if(x.equals("Two")){
            throw new ZeroException();//checked exception---- these are serious type exception
            // some example for checked type exceptions are; Exception, FileNotFoundException, User-Defined Exception etc. and they need to handled either by method signature or try-catch. like we did in main().
        }
        System.out.println("do something");
    }

    class ZeroException extends Exception{// this is user defined exception.

    }
}