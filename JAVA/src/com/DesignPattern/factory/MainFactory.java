package com.DesignPattern.factory;

public class MainFactory {
    public static void main(String[] args) {
        MainFactory obj = new MainFactory();
        OperatingSystem os = obj.getInstance("Ios");
        os.appCollection();
    }
    public  OperatingSystem getInstance(String str){
        switch (str) {
            case "windows" : return new Windows();
            case "Ios"  : return new Ios();
            default: return  new Android();
        }
    }
}
