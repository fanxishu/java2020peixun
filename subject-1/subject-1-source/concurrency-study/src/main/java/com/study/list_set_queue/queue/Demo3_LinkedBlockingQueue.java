package com.study.list_set_queue.queue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Demo3_LinkedBlockingQueue {
    public static void main(String args[]) throws InterruptedException {
        LinkedBlockingQueue <String> queue = new LinkedBlockingQueue<>();

        queue.put("48");
        queue.put("01");
        queue.put("12");
        queue.put("27");

        queue.put("31");

        for (;queue.size()>0;){
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




