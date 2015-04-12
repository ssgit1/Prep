package com.test.datastructures;

import com.test.common.Node;

/**
 * Created by ss on 2/7/15.
 */
public class LinkedList {
    Node head = null;

    /**
     * Adds an element to the beginning of the linked list
     */
    public void add(Node node) {
        if (node == null) {
            throw new NullPointerException("Empty Node passed to Add");
        }
        node.setNext(head);
        head = node;
    }

    public Node remove() {
        if (head == null) {
            return null;
        }
        Node node = head;
        head = head.getNext();
        return node;
    }

    public void reverse() {
        if (head == null) {
            // Nothing to do here
            return;
        }
        Node previous = null;
        Node current = head;
        Node next = head.getNext();
        while (current != null) {
            current.setNext(previous);
            previous = current;
            current = next;
            if (next != null) {
                next = next.getNext();
            }
            else{
                head = previous;
            }
        }
    }

    public Node findMiddle() {
        if (head == null) {
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = (head.getNext() != null)?head.getNext().getNext():null;
        while (fastPtr != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = (fastPtr.getNext() != null)?fastPtr.getNext().getNext():null;
        }
        return slowPtr;
    }

    public void printList() {
        Node current = head;
        boolean first = true;
        while (current != null) {
            if (!first) {
                System.out.print(" -> ");
            }
            System.out.print(current.getData());
            current = current.getNext();
            first = false;
        }
        System.out.println();
    }
}