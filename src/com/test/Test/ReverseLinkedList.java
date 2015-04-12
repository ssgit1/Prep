package com.test.Test;

import com.test.common.Node;
import com.test.datastructures.LinkedList;

/**
 * Created by ss on 2/7/15.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(new Node(2));
        l.add(new Node(1));
        l.add(new Node(0));
        l.add(new Node(0));
        System.out.println("Original Linked List:");
        l.printList();
        Node n = l.remove();
        System.out.println("Removed Node: " + n.getData());
        System.out.println("Modified Linked List:");
        l.printList();
        l.reverse();
        System.out.println("Reversed Linked List");
        l.printList();
    }
}