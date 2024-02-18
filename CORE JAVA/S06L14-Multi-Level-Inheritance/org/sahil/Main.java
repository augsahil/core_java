package org.sahil;

import animal.Animal;
import animal.fish.Eel;
import animal.fish.Fish;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Crocodile crocodile = new Crocodile();
        Fish fish = new Fish();
        Eel eel = new Eel();
        System.out.println("Animal properties is here->" + animal.showInfo());
        System.out.println("Reptile properties is here->" + reptile.showInfo());
        System.out.println("Crocodile properties is here->" + crocodile.showInfo());
        System.out.println("Fish properties is here->" + fish.showInfo());
        System.out.println("Eel properties is here->" + eel.showInfo());
    }
}