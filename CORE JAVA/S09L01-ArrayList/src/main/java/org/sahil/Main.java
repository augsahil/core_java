package org.sahil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listName = new ArrayList<>();//Type argument cannot be of primitive type because these collections like ArrayList work on object.
        listName.add("sahil1");
        listName.add("sahil2");
        listName.add("sahil3");
        listName.add("sahil4");
        listName.add("sahil5");
        listName.add("sahil6");
        listName.add("sahil7");
        listName.add("sahil8");
        System.out.println(listName);
        for (String arr: listName
             ) {
            System.out.println(arr);
        }
        System.out.println("getting 4th item printed: "+listName.get(3));
        listName.remove(1);
        System.out.println(listName.remove("sahil2"));
        System.out.println(listName);
        System.out.println("updating name: "+ listName.set(0, "kumar"));
        System.out.println(listName);
        System.out.println("search name: "+ listName.indexOf("sahil5"));
        System.out.println("search name: "+ listName.indexOf("sahil1"));



    }
}