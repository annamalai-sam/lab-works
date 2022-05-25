package com.collection;
import java.util.*;

public class SampleCollection {
    public static void main(String[] args) {
        Collection<Integer> sam = new LinkedList<>();
        sam.add(100);
        sam.add(200);
        sam.add(17);
        Collection<Integer> test = new Vector<>();
        test.add(39);
        test.add(55);
        test.add(87);
        Collection<Integer> obj = new ArrayList<>();
        System.out.println(obj.size());
        obj.add(17);
        obj.add(21);
        System.out.println("After .add() method : ");
        display(obj);
        obj.addAll(sam);
        obj.addAll(test);
        System.out.println("After .addAll() method : ");
        display(obj);
        obj.remove(100);
        System.out.println("After .remove() method : ");
        display(obj);
        obj.removeAll(sam);
        System.out.println("After .removeAll() method : ");
        display(obj);
        System.out.println("After .retainAll() method : ");
        obj.retainAll(test);
        display(obj);
        System.out.println("After .size method : ");
        System.out.println(obj.size());
        System.out.println("After .contains method : ");
        System.out.println(obj.containsAll(test));

        obj.clear();
        System.out.println("After .clear() method : ");
        display(obj);
        System.out.println("After .isEmpty() method : ");
        System.out.println(obj.isEmpty());
        display(obj);
    }
   static void display (Collection<Integer> obj){
        for (Integer oj:obj ) {
            System.out.println(oj);
        }
        //        System.out.println("After .contains() method : ");
        //        System.out.println(obj.contains(sam));
        //        System.out.println("After . method : ")
    }
}
