package com.hackerrank;

import java.util.*;

public class sample15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []a = new int [n];
        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            a[i] = temp;
        }
        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}