package com.collection;

import java.util.*;

public class SampleList {
    public static void main(String[] args) {
        List<Integer> addtional = new ArrayList<>(10);
        addtional.add(17);
        addtional.add(21);
        addtional.add(37);
        addtional.add(37);
        ArrayList<Integer> l = new ArrayList<>(addtional);
        display(l);
        List<Integer> num = new ArrayList<>();
        num.addAll(0, addtional);
        System.out.println("After .addAll() method : ");
        display(num);
//        num.remove(3);
//        System.out.println("After .remove() method : ");
//        display(num);
        System.out.println("After .indexOf() method : ");
        System.out.println(num.indexOf(17));
        System.out.println("After .lastIndexOf() method : ");
        System.out.println(num.lastIndexOf(17));
        System.out.println("After .get() method : ");
        System.out.println(num.get(3));
        num.set(3, 13);
        AbstractList<String> vp = new ArrayList<>();

    }
    static void display (Collection<Integer> obj) {
        for (Integer oj : obj) {
            System.out.println("ArrayList :"+oj);
        }
    }
}
