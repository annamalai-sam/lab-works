package com.FirstPackage;

public class string {
    public static void main(String[] args) {
        String myString = "Test";
        System.out.println(myString);
        myString.concat("Case");
        System.out.println(myString); // Answer
        StringBuffer BufferString = new StringBuffer("Test");
        System.out.println(BufferString);
        BufferString.append("Case");
        System.out.println(BufferString);  // Answer
    }
}