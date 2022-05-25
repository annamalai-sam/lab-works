package com.NonAccesModifier;
/*                        Static - Variable,Nested class,Static Methods and Static Block
                                    Variable - static variable have single copy,
                                     for it can't be changeable for every object, and
                                     it gives same value for all objects
                                     Static Methods -
 */
public class SampleStatic {
    static int a;
    static int b;
    int sum;
    static int add(int a,int b){
//        int a = 10;
        SampleStatic obj = new SampleStatic();
        obj.sum = b + a;
        return obj.sum;
    }
}
class main{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
//        System.out.println(SampleStatic.a);
//        System.out.println(SampleStatic.b);
        System.out.println(SampleStatic.add(a,b));
        SampleStatic obj1 = new SampleStatic();
        SampleStatic obj2 = new SampleStatic();
        System.out.println(obj1.add(10 ,30));
        System.out.println(obj2.add(20,30));
//        System.out.println("Object one :"+obj1.a);
//        System.out.println("Object two :"+obj2.a);
//        obj1.b= 100;
//        obj2.b = 200;
//        System.out.println(obj1.b);
//        System.out.println(obj2.b);
    }
}
