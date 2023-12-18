package org.sahil;

public class Main {
    public static void main(String[] args) {
//        Lock lock = new Lock();
//        if(lock.getCode() == "123456"){
//            System.out.println("The door is now open");
//        }
//        else{
//            System.out.println("the door is closed");
//        }
        //lock object is being created though it is used only for once. then why not create anonymous object and same memory.
        if(new Lock().getCode() == "123456"){
            System.out.println("The door is now open");
        }
        else{
            System.out.println("the door is closed");
        }

        if(args[0].equals( new Lock().getCode())){
            System.out.println("The door is now open");
        }
        else{
            System.out.println("the door is closed");
        }
    }
}