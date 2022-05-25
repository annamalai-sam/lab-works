package com.NonAccesModifier;
/*              Abstract - Method and Class
             Class - Abstract Class Cannot be instantiated,
                         but it has constructor.
            Method - Abstract must be inside abstract class,
                            it doesn't have method body,
                            it indicates that these need to be overridden in the subclass.
                            all the abstract method must be override in the subclass.
 */
abstract class AbstractClass {
    AbstractClass(){
        System.out.println("Annamalai");
    }
       void  test(){
            System.out.println("Testing Abstract class with non abstract and non static method");
      }
      static void test1(){
          System.out.println("Testing Abstract class with non abstract and static method");
      }
      abstract void sample();
      abstract void sample1();
}
 class NonAbstractClass extends AbstractClass{
    NonAbstractClass(){
        super();
    }
     @Override
     void sample() {
         System.out.println("Overriding super class abstract method");
     }

     @Override
     void sample1() {

     }
 }
 public class SampleAbstract {
     public static void main(String[] args) {
         NonAbstractClass obj = new NonAbstractClass();
         obj.sample();
         obj.sample1();
         obj.test();
         AbstractClass.test1();
     }
}