package com.assesment;

import java.util.Scanner;

public class accpect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        if (num >= 7000000000l && num <= 9999999999l){
//            Long last_num = num;
            System.out.println(num);
        }
    }
}
