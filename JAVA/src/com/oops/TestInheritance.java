package com.oops;
 class Freshworks{
        void aboutFreshworks(){System.out.println("Freshworks is leading saas company ");}
    }
    class Freshdesk extends Freshworks{
        void aboutFreshdesk(){System.out.println("Freshdesk is a one of the product in Freshworks");}
    }
   public class TestInheritance{
        public static void main(String args[]){
            Freshdesk d=new Freshdesk();
            d.aboutFreshdesk();
            d.aboutFreshworks();
        }}
