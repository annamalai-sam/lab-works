package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class SampleEnumeration {
    public static void main(String[] args) {
        Vector<String> obj = new Vector<>();
        obj.add("Annamalai");
        obj.add("Aswath");
        obj.add("Abisha");

        Enumeration e = obj.elements();
        while (e.hasMoreElements()){
            String i = (String) e.nextElement();
            System.out.println(i);
        }
        
    }
}
