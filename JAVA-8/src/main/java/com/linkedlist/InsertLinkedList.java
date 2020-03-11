package com.linkedlist;

import org.w3c.dom.Node;

import java.util.LinkedList;

/**
 * @author vikas.bhardwaj3
 * 2/25/20207:13 PM2020
 */
public class InsertLinkedList {
    static Node head;

    public static void main(String[] args) {
        InsertLinkedList linkedList = new InsertLinkedList();
        head = new Node(3);
        Node secNode = new Node(4);
        head.next = secNode;
        Node thirdNode = new Node(5);
        head.next.next = thirdNode;


        linkedList.printList();

    }

    private static void printList() {

        Node n = head;
        while (n!=null){
            System.out.println("linkedList = " + n.data);
            n=n.next;

        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
