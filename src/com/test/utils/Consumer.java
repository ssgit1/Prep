package com.test.utils;

import com.test.datastructures.BlockingQueue;

/**
 * Created by ss on 2/7/15.
 */
public class Consumer implements Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    private void doStuff() {
        Object o = queue.dequeue();
        System.out.println("Consumer - Dequeued a Message...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumer - Processed");
    }

    @Override
    public void run() {
        while (true) {
            doStuff();
        }
    }
}
