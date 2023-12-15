package org.sahil;

public class Main {
    public static void main(String[] args) {
        Person john = new John();
        john.eat();
        john.speak();
        Person pooja = new Pooja();
        pooja.eat();
        pooja.speak();

        Person person = new Person() {
            @Override
            public void eat() {
                System.out.println("Person can eat veg or non-ver food.");
            }
        };
        person.speak();
        person.eat();
    }
}