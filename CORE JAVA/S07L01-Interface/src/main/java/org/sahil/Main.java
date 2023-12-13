package org.sahil;

public class Main {
    public static void main(String[] args) {
//        SamsungPhone samsungPhone = new SamsungPhone();
//        String  p = samsungPhone.processor();
//        System.out.println(p);
//        System.out.println(samsungPhone.spaceInGb());
//
//        Iphone iphone = new Iphone();
//        String s;
//        s = iphone.processor();
//        System.out.println(s);
//        System.out.println(iphone.spaceInGb());

        Phone phone = new SamsungPhone();
        String  p = phone.processor();
        System.out.println(p);
        System.out.println(phone.spaceInGb());
        Android android = new SamsungPhone();
        System.out.println(android.whatsapp());
        SamsungPhone samsungPhone = new SamsungPhone();
        System.out.println(samsungPhone.spaceInGb());
        System.out.println(samsungPhone.processor());
        System.out.println(samsungPhone.whatsapp());


    }
}