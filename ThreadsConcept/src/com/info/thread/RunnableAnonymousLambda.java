package com.info.thread;

/*class E implements Runnable{
                                            //making anonymous class we can do it for F ckass also
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
}*/
class F implements Runnable{
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
public class RunnableAnonymousLambda {
    public static void main(String []args){
        Runnable obj= () ->                        //using lambda
        {
                for(int i=1;i<10;i++){
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("hi");
                }


        };


        D obj1= new D();

        Thread th1= new Thread(obj);
        Thread th2= new Thread(obj1);
        th1.start();
        th2.start();


    }
}

