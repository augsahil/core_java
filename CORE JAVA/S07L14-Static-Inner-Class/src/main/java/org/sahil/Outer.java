package org.sahil;

public class Outer {// we can not mark class static.

    public void message() {
        System.out.println("Hello Static");
    }

    public static class InnerClass {// if we are creating static inner class then prefer to create every element of inner class static, viz: variable or property.

        public static void staticMessage() {
            System.out.println("Hello Static2");
        }
    }

}
