package com.info.thread;
class C implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<10;i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hi");
        }
    }
}
class D implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello");
        }
    }
}
public class UsingRunnable {
    public static void main(String []args){
        C obj= new C();
        D obj1= new D();

        Thread th1= new Thread(obj);
        Thread th2= new Thread(obj1);
        th1.start();
        th2.start();


    }
}
