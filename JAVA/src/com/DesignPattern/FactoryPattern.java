package com.DesignPattern;

public class FactoryPattern {
    public  OperatingSystem getInstance(String str){
        switch (str) {
            case "windows" : return new Windows();
            case "Ios"  : return new Ios();
            default: return  new Android();
        }
    }
}
