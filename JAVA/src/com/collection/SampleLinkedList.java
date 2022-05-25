package com.collection;

import java.util.LinkedList;

public class SampleLinkedList {
    public static void main(String[] args) {
        LinkedList <String> obj = new  LinkedList<>();
        obj.addFirst("Remo");
        obj.add("Doctor");
        obj.addLast("DON");
        System.out.println(obj);
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        obj.removeFirst();
        obj.removeLast();
        System.out.println(obj);
    }
}
