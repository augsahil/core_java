package org.sahil;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.case1(13,5);
        main.case1(4, 0);

        main.case2(34, 7);
        main.case2(39, 0);
        int y = 89, x;
        try{
            System.out.println("before exception");
            x = (y=10*10)/0;//y=10*10 is sub-statement, so sub-statement 1st get execute then whole statement execute and then thereafter exception will come in consideration.
            System.out.println("after exception");
        }
        catch (ArithmeticException e){//this is child class of Exception, so it should be used before Exception class.
            System.out.println("Divide by 0 ArithmeticException");
            System.out.println(e);
            e.printStackTrace();
        }
        finally {// it gets executed at last does not matter whether exception is there or not. and it must be last one i.e after try and catch block
            System.out.println("Finally block: "+y);
        }
        try{
            System.out.println("before exception");
            y=200;
            System.out.println("the divide by zero exception: "+20/0);// this is completely single statement. we cant say "the divide by zero exception: " should be printed before exception.
            y = 300;// value of y will not be updated, because it is coming after exception comes.
            System.out.println("after exception");
        }
        //Hierarchy of Exception does matter a lot.
        catch (ArithmeticException e){//this is child class of Exception, so it should be used before Exception class.
            System.out.println("Divide by 0 ArithmeticException");
            System.out.println(e);
            e.printStackTrace();
        }
        catch (Exception e){//this is parent class of ArithmeticException, so it should be used after ArithmeticException class.
            System.out.println("Divide by 0 exception");
            System.out.println(e);
            e.printStackTrace();
        }
        finally {// it gets executed at last does not matter whether exception is there or not. and it must be last one i.e after try and catch block
            System.out.println("Finally block: "+y);
        }
        
        try{
            System.out.println("Its only for try and finally block. catch may or may not be present.");
        }
        finally {
            System.out.println("it is fianlly block and it has special power.");
        }
    }
    public void case1(int x, int y){
        if(y!= 0){
            System.out.println("The value of x/y: "+ x/y);
        }
        else{
            System.out.println("The value of y = 0, a possible exception");
        }

    }
    public void case2(int x, int y){
        try{
            System.out.println("The value of x/y: "+ x/y);
        }
        catch (Exception e){
            System.out.println("The value of y = 0, a possible exception "+ e);
        }
    }
}