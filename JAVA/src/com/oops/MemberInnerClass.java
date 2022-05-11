package com.oops;

import jdk.dynalink.beans.StaticClass;

class OuterClass{
    void outer(){
        System.out.println("Outer Class");
    }
    class InnerClass{
        void inner(){
            System.out.println("Inner Class");
        }
    }
    static class StaticInnerClass{
        static void innerStatic(){
            System.out.println("Static Inner Class Static method");
        }
        void innerNotStatic(){
            System.out.println("Static Class default method");
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass outObj = new OuterClass();
        outObj.outer();
        OuterClass.InnerClass inObj = outObj.new InnerClass();
        inObj.inner();
        OuterClass.StaticInnerClass.innerStatic();
        OuterClass.StaticInnerClass static_inner_class = new OuterClass.StaticInnerClass();
        static_inner_class.innerNotStatic();
    }
}