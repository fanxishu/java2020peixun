/*
package com.study.cas.atomic;

import java.util.concurrent.atomic.LongAccumulator;

public class Demo3_LongAccumulator {
    public static void main(String[] args) throws InterruptedException {

        LongAccumulator accumulator = new LongAccumulator(
                (y,x)->{
                    System.out.println("x:" + x + ",y:" + y);
                    return  x + y+2;
                },
                0L);

        for (int i = 0; i < 3; i++) {
            accumulator.accumulate(1);
        }

        System.out.println("result=" + accumulator.get());
    }
}
*/
