package com.info.thread;

import java.util.HashMap;
import java.util.Map;

public class NotThreadSafe {

    static Map<String,Integer> map = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(()->{
            for(int i=0; i<1000; i++) {
                map.put("key", map.getOrDefault("key", 0)+1);
            }

        });

        Thread t2= new Thread(()->{
            for(int i=0; i<1000;i++){
                map.put("key", map.getOrDefault("key", 0)+1);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("total value: "+ map.get("key"));
    }
}

