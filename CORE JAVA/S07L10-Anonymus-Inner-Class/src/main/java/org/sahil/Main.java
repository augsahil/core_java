package org.sahil;

public class Main {
    public static void main(String[] args) {
        Lock lock = new Lock() {
            @Override
            public void isUnlocked(String key) {
                if(key.equals("qwerty")){
                    System.out.println("Shop is open");
                }
                else{
                    System.out.println("Shop is closed");
                }
            }
        };
        lock.isUnlocked("iahla");

        new Lock() {//A nonymous inner class
            @Override
            public void isUnlocked(String key) {
                if(key.equals("qwerty")){
                    System.out.println("Shop is open");
                }
                else{
                    System.out.println("Shop is closed");
                }
            }
        }.isUnlocked("qwerty");
    }
}