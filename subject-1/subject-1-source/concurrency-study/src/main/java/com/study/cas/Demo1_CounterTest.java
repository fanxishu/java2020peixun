package com.study.cas;

public class Demo1_CounterTest {

    public static void main(String[] args) throws InterruptedException {
        final CounterSync ct = new CounterSync();

        for (int i = 0; i < 6; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        ct.add();
                    }
                    System.out.println("done...");
                }
            }).start();
        }

        Thread.sleep(6000L);
        System.out.println(ct.i);
    }
}

