package com.oops;
class CSRIndia extends Freshworks{
    void managerName(){
        System.out.println("Shyam");
    }
}
class FreshWorksSoftwareAcademy extends CSRIndia{
    void techCoachName(){
        System.out.println("Chitra");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        FreshWorksSoftwareAcademy obj = new FreshWorksSoftwareAcademy();
        obj.techCoachName();
        obj.managerName();
        obj.aboutFreshworks();
    }

}
