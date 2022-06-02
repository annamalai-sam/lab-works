package SampleProgram;

import java.util.Scanner;

class  sample {
     sample(){
        System.out.println("In constructor");
    }
    void myMethod1(){
        System.out.println("myMethod1");
    }

    void myMethod(){
         sample onj = new sample();
         onj.myMethod1();
        System.out.println("Annamalai");

    }
    public static void main(String[] args) {
//        Scanner scan1  = new Scanner(System.in);
//        int a1 = scan1.nextInt();
//        Scanner scan2  = new Scanner(System.in);
//        int a2 = scan2.nextInt();
//        Scanner scan3  = new Scanner(System.in);
//        int a3 = scan3.nextInt();
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
        sample onj = new sample();
        onj.myMethod();
    }
}