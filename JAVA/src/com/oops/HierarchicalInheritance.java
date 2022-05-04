package com.oops;

class Freshsales extends Freshworks{
    void aboutFreshsales(){System.out.println("Freshsales is a one of the product in Freshworks");}
}  class Freshmarketer extends Freshworks{
    void aboutFreshmarketer(){System.out.println("Freshmarketer is a one of the product in Freshworks");}
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Freshsales obj1 = new Freshsales();
        obj1.aboutFreshworks();
        obj1.aboutFreshsales();
        Freshmarketer obj2 = new Freshmarketer();
        obj2.aboutFreshworks();
        obj2.aboutFreshmarketer();
    }
}
