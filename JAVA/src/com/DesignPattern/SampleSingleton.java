package com.DesignPattern;

public class SampleSingleton {
    private static SampleSingleton obj;
    public static SampleSingleton getInstance(){
        if (obj==null){
            obj = new SampleSingleton();
        }
        return obj;
    }
    private  SampleSingleton(){}
    public void sampleSingletonMethod( int a){
        System.out.println("Working....."+ a);
    }
}
class sample{
    public static void main(String[] args) {
        SampleSingleton test = SampleSingleton.getInstance();
        test.sampleSingletonMethod(10);
        SampleSingleton test1 = SampleSingleton.getInstance();
        test1.sampleSingletonMethod(20);
    }
}