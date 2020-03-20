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
        linkedList.delete(1);
        System.out.println("\nafter deleted Linked list is:");
        linkedList.printList();

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.println("tNode.data = " + tNode.data);
            tNode = tNode.next;

        }
    }

    public Node delete(int k) {
        Node first = head;
        Node secondPointer = head;
        for (int i = 0; i < k; i++) {
            if (secondPointer == null) {
                if (i == k - 1) {
                    return head.next;
                }
                return head;
            }
            secondPointer = secondPointer.next;
        }
        while (secondPointer.next != null) {
            first = first.next;
            secondPointer = secondPointer.next;
        }

        first.next = first.next.next;
        return head;
    }


    class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;

        }
    }
}
