package com.DesignPattern.singleton;
public class EarlySingleton {
    private EarlySingleton(){}
    public static final EarlySingleton instance = new EarlySingleton();
    public void EarlySingletonMethod (String name){
        System.out.println("In EarlySingleton Method");
        System.out.println("My Name is "+ name);
    }
}
class sample2{
    public static void main(String[] args) {
        EarlySingleton object1 = EarlySingleton.instance;
        object1.EarlySingletonMethod("Annamalai");
        EarlySingleton object2 = EarlySingleton.instance;
        object2.EarlySingletonMethod("Aswath");
    }
}