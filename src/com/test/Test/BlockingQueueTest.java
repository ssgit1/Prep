package com.test.Test;

import com.test.datastructures.BlockingQueue;
import com.test.utils.Producer;
import com.test.utils.Consumer;

/**
 * Created by ss on 2/7/15.
 */
public class BlockingQueueTest {
    public static void main(String[] args) {

        BlockingQueue queue = new BlockingQueue(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
