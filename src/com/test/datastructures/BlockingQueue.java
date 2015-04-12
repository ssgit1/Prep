package com.test.datastructures;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Created by ss on 2/7/15.
 */
public class BlockingQueue {

    private Queue queue = new LinkedList();
    private int capacity;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public synchronized void enqueue(Object o) {
        while (queue.size() == capacity) {
            // block
            try {
                System.out.println("Queue Full Waiting");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // add
        System.out.println("Add");
        queue.add(o);
        // Notify consumers
        notifyAll(); // vs notify()
    }

    public synchronized Object dequeue() {
        while (queue.isEmpty()) {
            try {
                System.out.println("Queue Empty Waiting");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Removed");
        Object o = queue.remove();
        notifyAll();
        return o;
    }

}
