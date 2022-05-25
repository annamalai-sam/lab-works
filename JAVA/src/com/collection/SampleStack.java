package com.collection;

import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Stack<String> obj = new Stack<>();
        System.out.println(obj.capacity());
        obj.push("First Element");
        obj.push("Middle Element");
        obj.push("Last Element");
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
        System.out.println(obj.peek());
        System.out.println(obj.search("First Element"));
    }
}
