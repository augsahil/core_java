package org.sahil;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        String[] name = new String[size];
        String[] names = {"sahil", "kumar", "sahil1", "kumar1"};
        for (String arr : names
             ) {
            System.out.println(arr);
        }
        for (String arr : name
        ) {
            System.out.println(arr);
        }

        float[] fArr = { 4.6f, 34.6f, 4.6f, 87.6f, 789.3f, 70, 67 };//decimanl in java by default it consider as double, if we want float then we need to explicitely mention it.
        double[] dArr = {8.5, 89.3};
        for (float f : fArr
             ) {
            System.out.println(f);
        }
    }
}