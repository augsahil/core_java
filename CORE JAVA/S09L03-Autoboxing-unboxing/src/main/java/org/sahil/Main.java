package org.sahil;

import java.util.ArrayList;

class IntWrapper{
    public int num;
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public IntWrapper(int num){
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
//        ArrayList<int> numberList = new ArrayList<>(); //Type argument cannot be of primitive type because these collections like ArrayList work on object.
        ArrayList<Integer> numberList = new ArrayList<>();// Integer is in-built wrapper, gives us ability to autoboxing.
        numberList.add(21);//autoboxing
        numberList.add(73);
        numberList.add(35);
        System.out.println("getting element of specific index: "+ numberList.get(2));//Auto unboxing
        System.out.println(numberList);

        ArrayList<IntWrapper> numberList2 = new ArrayList<>();// Integer is in-built wrapper, gives us ability to autoboxing.
//        numberList2.add(21);//autoboxing not work
        numberList2.add(new IntWrapper(23));//boxing or manual boxing
        numberList2.add(new IntWrapper(45));
        numberList2.add(new IntWrapper(56));
        numberList2.add(new IntWrapper(67));
        System.out.println("getting element of specific index: "+ numberList2.get(2).getNum());//Manual unboxing
        System.out.println(numberList2);// ? how to print all the element of arraylist for user defined wrapper class.

        //autoboxing-unboxing for double
        ArrayList<Double> doublesList = new ArrayList<>();
        doublesList.add(454.6);
        System.out.println(doublesList);
        System.out.println(doublesList.get(0));

        ArrayList<Double> doublesList2 = new ArrayList<>();
        doublesList2.add(Double.valueOf(454.6));
        doublesList2.add(Double.valueOf(378.4));
        doublesList2.add(Double.valueOf(44.8));
        doublesList2.add(Double.valueOf(54.9));
        System.out.println(doublesList2);
        System.out.println(doublesList2.get(0).doubleValue());
    }
}