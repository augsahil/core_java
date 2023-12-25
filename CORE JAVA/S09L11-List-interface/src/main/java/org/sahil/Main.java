package org.sahil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("sahil");
        list1.add("gaurav");
        list1.add("sam");
        list1.add("don");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("john");
        list2.add("arsh");
        list2.add("kumar");
        list2.add("name");
        System.out.println(list2);

        for (String l2: list2
             ) {
            System.out.println(l2);
        }
        System.out.println("-------------------");

        new Main().printList(list2);//since list1 and list2 both are list, but we cant pass list1 here because list1 is linked list. But we can do it by using List interface.
        System.out.println("-------------------");
        Main main = new Main();
        main.printListUsingListInterface(list1);
        System.out.println("-------------------");
        main.printListUsingListInterface(list2);
    }
    void printList(ArrayList<String> list){
        for (String l: list
             ) {
            System.out.println(l);
        }
    }

    void printListUsingListInterface(List<String> list){
        for (String l: list
             ) {
            System.out.println(l);
        }
    }
}