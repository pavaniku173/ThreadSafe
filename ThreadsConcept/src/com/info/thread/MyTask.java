package com.info.thread;
//
//class Demo implements Runnable {
//
//    @Override
//    public void run() {
//        for(int i=0; i<1000;i++){
//            System.out.println(i);
//        }
//    }

//public class MyTask {
//    public static void main(String[] args) {
//
//        //Demo demo= new Demo();
//        Thread t1 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//
//                }
//            }
//        });
//
//
//    }
//}

public class MyTask {
    public static void main(String[] args) {

        //Demo demo= new Demo();
        Thread t1 = new Thread(()-> {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);

                }
        });


    }
}
