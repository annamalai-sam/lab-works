package com.hackerrank;

import java.util.Scanner;

public class sample19 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        for (int i=1; i<s.length()-k+1; i++) {
            String temp = s.substring(i, i+k);
            if (smallest.compareTo(temp) > 0) {
                smallest = temp;
            }
            if (largest.compareTo(temp) < 0) {
                largest = temp;
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
