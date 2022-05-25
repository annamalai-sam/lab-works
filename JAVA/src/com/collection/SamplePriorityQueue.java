package com.collection;
import java.util.PriorityQueue;
public class SamplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> obj = new PriorityQueue<>();
        obj.offer("Annamalai");
        obj.offer("Aswath");
        obj.offer("Annapoorani");
        obj.remove();
        System.out.println(obj.poll());
        System.out.println(obj);
        System.out.println(obj.peek());
    }
}