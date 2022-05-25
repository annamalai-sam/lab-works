package com.collection;

import java.util.ArrayList;

public class SampleArrayList {
    public static void main(String[] args) {
        ArrayList<String > technologyList = new ArrayList<>();
        technologyList.add("HTML");
        technologyList.add("CSS");
        technologyList.add("JS");
        technologyList.add("JAVA");
        technologyList.add("Ruby");
        technologyList.add(4,"MySql");
        System.out.println(technologyList);
    }
}
