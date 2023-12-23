package org.sahil;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(35);
        stack.push(34);
        stack.push(54);
        stack.push(64);
        stack.push(76);
        System.out.println("whole stack: "+stack);
        System.out.println("peek stack: "+stack.peek());
        System.out.println("isEmpty stack: "+stack.isEmpty());
        System.out.println("search 65 in stack: "+stack.search(65));
        System.out.println("search 64 in stack: "+stack.search(64));
        System.out.println("size of stack: "+stack.size());
        System.out.println("pop stack: "+stack.pop());
    }
}