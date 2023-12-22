package org.sahil;

public class Main {
    public static void main(String[] args) {
        String name = "Sahil", x="kumar";
        String name2 = "Sahil";
        String newName = name.concat(" ").concat(x);
        System.out.println(newName);
        System.out.println(name.toLowerCase());
        if(name == name2){
            System.out.println("equal");
        }else{
            System.out.println("it is false because it compare memory location value(because String in java is class), not string value. ");
        }
    }
}