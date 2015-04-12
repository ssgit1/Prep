package com.test.utils;

import com.test.datastructures.BlockingQueue;

/**
 * Created by ss on 2/7/15.
 */
public class Producer implements Runnable {
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i=0; i<30; i++) {
            Object o = new Integer(i);
            System.out.println("Producer - Added a Message");
            queue.enqueue(o);
        }
    }
}
