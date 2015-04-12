package com.test.Test;

import com.test.common.Node;
import com.test.datastructures.LinkedList;

/**
 * Created by ss on 2/7/15.
 */
public class LinkedListMiddle {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(new Node(2));
        l.add(new Node(1));
        l.add(new Node(0));
        l.add(new Node(0));
        System.out.print("Linked List: ");
        l.printList();
        System.out.println("Middle Node: " + l.findMiddle().getData());
        l.remove();
        System.out.print("Linked List: ");
        l.printList();
        System.out.println("Middle Node: " + l.findMiddle().getData());
        l.remove();
        System.out.print("Linked List: ");
        l.printList();
        System.out.println("Middle Node: " + l.findMiddle().getData());
        l.remove();
        System.out.print("Linked List: ");
        l.printList();
        System.out.println("Middle Node: " + l.findMiddle().getData());
        l.remove();
        l.reverse();
        System.out.print("Reversed List: ");
        l.printList();
        l.add(new Node(100));
        System.out.print("Linked List: ");
        l.printList();
        l.reverse();
        System.out.print("Reversed List: ");
        l.printList();
    }
}
