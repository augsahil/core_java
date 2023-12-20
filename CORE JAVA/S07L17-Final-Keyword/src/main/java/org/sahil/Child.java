package org.sahil;

public class Child {
    public int x = 10;
    public final int finalVar = 1;//this variable cant be changed in future. and its initialization is essential.
    public final int y;// we can also initialize this in constructors.

    public int getFinalVar() {
        return finalVar;
    }

    public Child() {
        this.y = 37;//our job is not done yet, we need to declare y in parameterised constructor as well.
    }

    public Child(int x, int y) {
        this.x = x;
        this.y = y;// now we are done.
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
