package com.hackerrank;

import java.util.Scanner;

public class sample3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >=1 && n<=100){
            if (n%2== 1|| n>=6 &&n <=20){
                System.out.println("Weird");
            }  else{
                System.out.println("Not Weird");
            }
        }
    }
}
