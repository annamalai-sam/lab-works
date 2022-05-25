package com.DesignPattern;

public class LazySingleton {
    private static LazySingleton obj;
    public static LazySingleton getInstance(){
        if (obj==null){
            obj = new LazySingleton();
        }
        return obj;
    }
    private LazySingleton(){}
    public void LazySingletonMethod(int a){
        System.out.println("Working....."+ a);
    }
}
class sample1 {
    public static void main(String[] args) {
        LazySingleton test = LazySingleton.getInstance();
        test.LazySingletonMethod(10);
        LazySingleton test1 = LazySingleton.getInstance();
        test1.LazySingletonMethod(20);
    }
}