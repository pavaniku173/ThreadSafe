package com.info.thread;

 class ThreadTask implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("using runnable interface");
        }
    }

    public static void main(String[] args){
        ThreadTask task= new ThreadTask();
        task.run();
    }
}
