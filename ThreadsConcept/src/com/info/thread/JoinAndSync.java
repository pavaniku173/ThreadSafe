package com.info.thread;


class Counter{
    int count=0;
    public  synchronized void  increment(){
        count++;
    }
}


public class JoinAndSync {
    public static void main(String []args) throws InterruptedException {
        Counter co= new Counter();
             Runnable obj3= () -> {
                         for(int i=1;i<=10000;i++){
                               co.increment();

                         }
             };
             Runnable obj4= () -> {
            for(int i=1;i<=10000;i++){
                co.increment();

            }
        };


        Thread th4= new Thread(obj3);
        Thread th5= new Thread(obj4);
        th4.start();
        th5.start();
        th4.join();
        th5.join();
        System.out.println(co.count);


    }
}
