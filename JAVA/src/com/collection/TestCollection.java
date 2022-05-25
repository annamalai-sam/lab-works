package com.collection;

import java.util.*;
    public class TestCollection {
        public static void main(String args[]){
            List<String> students=new ArrayList<>();
//            LinkedList vp = new LinkedList<>(students);
            students.add("Annamalai");
            students.add("Aswath");
            students.add("Hasan");
            for(String fruit:students)
                System.out.println("ArrayList Class : "+fruit);
            arry(students);
        }
        static void arry (List<String> students){
          LinkedList<String> obj   = new LinkedList<>(students);
            for (String student: obj ) {
                System.out.println("LinkedList Class : "+student);
            }
            Vector<String> Vectorobj = new Vector<>(students);
            for (String stu:Vectorobj) {
                System.out.println("Vector Class :"+stu);
            }
        }
    }