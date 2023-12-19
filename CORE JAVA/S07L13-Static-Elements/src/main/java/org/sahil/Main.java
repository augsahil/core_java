package org.sahil;

public class Main {
    public static void main(String[] args) {
        TestNonStatic testNonStatic = new TestNonStatic();
        System.out.println("1st obj: "+ testNonStatic.getNonStaticVar());
        testNonStatic.setNonStaticVar(25);
        System.out.println("1st obj updated: "+ testNonStatic.getNonStaticVar());

        TestNonStatic testNonStatic1 = new TestNonStatic();
        System.out.println("2nd obj: "+ testNonStatic1.getNonStaticVar());
        testNonStatic1.setNonStaticVar(66);
        System.out.println("2nd obj updated: "+ testNonStatic1.getNonStaticVar());
        //-----------------------------------------//

        TestStatic testStatic = new TestStatic();
        System.out.println("3rd obj: "+ testStatic.getStaticVar());
        testStatic.setStaticVar(34);
        System.out.println("3rd obj: "+ testStatic.getStaticVar());

        TestStatic testStatic1 = new TestStatic();
        System.out.println("4th obj: "+ testStatic1.getStaticVar());
        testStatic.setStaticVar(3);
        System.out.println("4th obj: "+ testStatic1.getStaticVar());
        // we don't need different obj to handle different static scenario.
        // it will work equally even we don't create testStatic1 and use only testStatic.
    }
}