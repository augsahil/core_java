package org.sahil;

public class TestNonStatic {
    public int nonStaticVar = 0;

    public int getNonStaticVar() {
        return nonStaticVar;
    }

    public void setNonStaticVar(int staticVar) {
        this.nonStaticVar = staticVar;
    }
}
