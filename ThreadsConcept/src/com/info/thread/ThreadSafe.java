package com.info.thread;

import java.util.HashMap;
import java.util.Map;

public class ThreadSafe {

    static Map<String, Integer> item = new HashMap<>();

    public static synchronized void increment(){
        item.put("key", item.getOrDefault("key",0)+1);
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(()->{
            for(int i=0; i<1000; i++) {
                increment();
            }
        });
        Thread t2= new Thread(()->{
            for(int i=0; i<1000; i++){
                increment();
            }
        });

        t1.start();
        t2.start();

       t1.join();
       t2.join();

        System.out.println(item.get("key"));

    }
}
