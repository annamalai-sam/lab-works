package com.DesignPattern.factory;

public class Android implements OperatingSystem{
    @Override
    public void appCollection() {
        System.out.println("I have Google Play store");
    }
}
