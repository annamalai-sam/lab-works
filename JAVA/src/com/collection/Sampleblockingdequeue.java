package com.collection;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.Runnable;
import java.lang.Thread;

public class Sampleblockingdequeue extends Thread {
    static BlockingQueue<String> list;
    public static void main(String[] args) throws InterruptedException {
        list = new LinkedBlockingQueue<>(3);
        list.put("annamalai");
        list.put("riyas");
        list.put("ashwath");
        Sampleblockingdequeue obj = new Sampleblockingdequeue();
        obj.start();
        Thread.sleep(10);
        list.put("kasi");
        System.out.println(list);
    }

    @Override
    public void run() {
        list.remove("ashwath");
        System.out.println(list);
    }
}
