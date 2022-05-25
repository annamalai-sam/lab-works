package com.collection;

import java.util.LinkedHashSet;

public class SampleLinkHashSet {
    public static void main(String[] args) {
        LinkedHashSet obj = new LinkedHashSet<>();
        obj.add("Apple");
        obj.add("Samsung");
        obj.add("Sony");
        obj.add("Oneplus");
        System.out.println(obj.add("Oneplus"));
        System.out.println(obj);
    }
}
