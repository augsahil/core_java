package org.sahil;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("sahil", 24, "Male");
        System.out.println(person);

        PersonEncapsulate personEncapsulate = new PersonEncapsulate("sahil", 24, "Male");
        personEncapsulate.setAge(-55);
        System.out.println(personEncapsulate);
    }
}