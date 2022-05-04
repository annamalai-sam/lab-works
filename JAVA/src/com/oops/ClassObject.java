package com.oops;

public  class ClassObject {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        System.out.println(obj.a);                           // here "a" is an instance variable for access instance variable need to create object for a class.
        System.out.println(TestClass.b);// here "b" is a class variable which means that variable is declared as static, for access class variable no need to create object for a class.
        System.out.println(obj.testCase1());
        System.out.println(TestClass.testCase2());
    }
}
class TestClass{
    int a = 10;                      // instance variable
    static  int b = 20;          // class variable
    public String testCase1(){
        String sample1 = "Tested ok 1";
        return  sample1;
    }
    public static String testCase2(){
        String sample2 = "Tested ok 2";
        return  sample2;
    }
}