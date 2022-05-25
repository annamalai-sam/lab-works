package com.collection;

import java.util.HashSet;

public class SampleHashSet {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("Apple");
        obj.add("Samsung");
        obj.add("Sony");
        obj.add("Oneplus");
        System.out.println(obj.add("Oneplus"));
        System.out.println(obj);
    }
}
