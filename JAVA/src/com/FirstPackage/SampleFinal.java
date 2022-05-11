package com.FirstPackage;
class sample{
    final int c = 10;
   final void add(int c){
        int a =10;
        int b = 20;
        int sum = a+b;
       System.out.println(c);
//        System.out.println("Sum is "+ sum);

    }
}
final class test extends sample {   // final class cannot be super class to

}
public class SampleFinal {
    public static void main(String[] args) {
        test obj = new test();
        final int c = 30;
        obj.add(c);
    }
}
