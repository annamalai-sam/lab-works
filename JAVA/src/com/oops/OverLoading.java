package com.oops;

public class OverLoading {
     int add(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        return sum;
    }
    int add(int i){
        int a = 10;
        int b = 20;
        int sum = a+b;
        return sum;
    }
}
class sample{
    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        System.out.println(obj.add(3));
    }
}
