package com.linkedlist;

/**
 * @author vikas.bhardwaj3
 * 3/10/20204:56 PM2020
 */
public class DeleteElementFromLast {

    static Node head;

    public static void main(String[] args) {

        DeleteElementFromLast linkedList = new DeleteElementFromLast();
        linkedList.push(12);
        linkedList.push(13);
        linkedList.push(14);
        linkedList.push(15);
        linkedList.push(16);
        System.out.println("\nCreated Linked list is:");
        linkedList.printList();
        // linkedList.delete(1);

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next =head;
        head =new_node;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.println("tNode.data = " + tNode.data);
            tNode = tNode.next;

        }
    }

   /* public void delete(int k) {
        Node first = head;
        Node secondPointer = head.next;
    }*/

    class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;

        }
    }
}
