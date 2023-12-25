package org.sahil;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("sahil");
        names.add("gaurav");
        names.add("sam");
        names.add("don");
        names.add("john");
        names.add("arsh");
        names.add("kumar");
        System.out.println(names);
        names.add("name");
        names.add(2, "name at index2");
        System.out.println(names);
        names.set(2, "set new name at index2");
        System.out.println(names);
    }
}