package com.hackerrank;

import java.util.Scanner;

public class sample14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String rev = "";
        char temp;
        if (A.length() <= 50) {
            for (int i = 0; i < A.length(); i++) {
                temp = A.charAt(i);
                rev = temp + rev;
            }
            if (rev.equals(A)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}