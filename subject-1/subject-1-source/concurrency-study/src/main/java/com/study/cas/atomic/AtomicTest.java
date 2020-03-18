package com.study.cas.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicTest {
    public static void main(String args[]){
        AtomicIntegerArray array = new AtomicIntegerArray(3);
        array.set(1, 14);
        array.compareAndSet(1,14,13);
        System.out.println(array.get(1));


        AtomicReference<Thread> th = new AtomicReference<>();
       System.out.println(th.get());
        th.compareAndSet(null,Thread.currentThread());
        System.out.println(th.get());



    }
}
