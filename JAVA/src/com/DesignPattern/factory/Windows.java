package com.DesignPattern.factory;

public class Windows implements OperatingSystem{
    @Override
    public void appCollection() {
        System.out.println("I have Microsoft Store");
    }
}
