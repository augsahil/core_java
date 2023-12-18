package org.sahil;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        System.out.println(door.isLocked("kdajh"));
        if(door.isLocked(args[1])){
            System.out.println("Door is locked");
        }
        else {
            System.out.println("Door is unlocked");
        }
    }
}