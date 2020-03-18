package com.study.jmm;

public class Demo2Visibility {
    int i = 0;
   volatile boolean isRunning = true;

    public static void main(String args[]) throws InterruptedException {

        Demo2Visibility demo = new Demo2Visibility();

     Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
int i=0;
                while(true){

                   i++;
                }
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {

                int j=0;
                while(!thread.isInterrupted()){
                    System.out.println("j" +j++);

                }
                System.out.println(demo.i);
            }
        });
        thread.start();
        System.out.println("子线程 here i am..."+thread.isInterrupted());

        thread2.start();

        Thread.sleep(3000L);
        thread2.interrupt();
        thread.interrupt();
        System.out.println("子线程 here i am..."+thread.isInterrupted());

        demo.isRunning = false;
        System.out.println("主线程shutdown...");
    }
}
