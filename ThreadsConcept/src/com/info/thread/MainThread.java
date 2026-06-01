package com.info.thread;

class A extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("all");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}



public class MainThread {
    public static void main(String []args) throws InterruptedException {

        A obj1= new A();
        B obj2=new B();
        //System.out.println(obj2.getPriority());
        //obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        Thread.sleep(5);              //without this it prints based on schedular after making it sleep it wait also schedular istam
        obj2.start();




    }
}
