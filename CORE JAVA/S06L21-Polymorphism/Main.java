package org.sahil;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.feature();
        Nokia3310 nokia3310 = new Nokia3310();
        nokia3310.feature();
        Iphone iphone = new Iphone();
        iphone.feature();


        //make use of polymorphism
        Phone phone1; //blank object... treat it like, you purchased a phone and don't know it's model of any specifications.
        phone1 = new Nokia3310(); //Since Nokia3310 extends Phone i.e Nokia3310 is a Phone... treat it like you get to know now purchased phone's model of any specifications.
        phone1.feature();
    }
}