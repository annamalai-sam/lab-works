package com.theory;

interface sample {
   static void add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum is :" + sum);
    }
    default void sub(){
        int a = 10;
        int b = 20;
        int sum = a - b;
        System.out.println("Sum is :" + sum);
    }
}
