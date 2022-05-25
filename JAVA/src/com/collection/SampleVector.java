package com.collection;

import java.util.ArrayList;
import java.util.Vector;

public class SampleVector {
    public static void main(String[] args) {
        Vector<Integer> obj = new Vector<>();
        System.out.println(obj.capacity());
        obj.addElement(1000);
        obj.addElement(876);
        obj.addElement(1000);
        System.out.println(obj);
        obj.removeElement(1000);
        System.out.println(obj);
        obj.removeElementAt(1);
        System.out.println(obj);
        obj.removeAllElements();
        System.out.println(obj);
    }
}
