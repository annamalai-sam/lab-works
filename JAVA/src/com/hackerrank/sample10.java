package com.hackerrank;

import java.util.Scanner;

public class sample10 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
            String s=sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}