package com.FirstPackage;
class sample{
    void add(){
        int a =10;
        int b = 20;
        int sum = a+b;
        System.out.println("Sum is "+ sum);
    }
}
final class test extends sample {   // final class cannot be super class to
}
public class SampleFinal {
    public static void main(String[] args) {
        test obj = new test();
        obj.add();
    }
}
