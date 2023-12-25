package org.sahil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sahil kumar");
        list.add("gaurav kumar");
        list.add("Sam gupta");
        list.add("John");

        new Main().printList(list);
        System.out.println("---------------------");
        list.sort(null);// for natural ordering
        //capital case comes 1st in natural ordering.
        System.out.println(list);
        System.out.println("---------------------");
        Collections.reverse(list);
        System.out.println(list);
    }
    void printList(List<String> list){
        Iterator<String> data = list.listIterator();
        while (data.hasNext()){
            System.out.println(data.next());
        }
    }
}