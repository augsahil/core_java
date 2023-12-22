package org.sahil;

public enum EnumWithValues {
    COREJAVA(1),
    COLLECTION(2),
    GERNERICS(3),
    JSP(4),
    MULTITHREADING(5);

    private int i;

    EnumWithValues(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
