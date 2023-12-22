package org.sahil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//    Main main = new Main();
//    main.doSomething();
//    main.doSomethingNew();
//    }
    public static void main(String[] args) {
        Main main = new Main();
        main.doSomething();
        try{// we can also do in this way if we dont apply method signature to main().
            main.doSomethingNew();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try{
            main.doSenseLess();
        }finally {
            System.out.println("this is not manking any sense");
        }
    }
    public void doSomething(){
        try{
            FileReader in = new FileReader("text.txt");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Do Something!");

    }

    public void doSomethingNew() throws FileNotFoundException{
        System.out.println("Do Something New! before");
        FileReader in = new FileReader("text.txt");
        System.out.println("Do Something New! after");
    }

    public void doSenseLess() throws RuntimeException{
        String x = "demo";
        if(x.equals("demo")){
            throw new RuntimeException();
        }
        System.out.println("Doing senseless demo!");
    }
}