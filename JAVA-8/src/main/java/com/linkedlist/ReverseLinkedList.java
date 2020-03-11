package com.linkedlist;

import org.w3c.dom.Node;

/**
 * @author vikas.bhardwaj3
 * 2/25/20206:39 PM2020
 */

public class ReverseLinkedList {
    static Node head;

    static class Node {

        int d;
        Node next;

        Node(int data) {
            d = data;
            next = null;
        }
    }

    public static void main(String[] args) {

        ReverseLinkedList insertLinkedList = new ReverseLinkedList();
        insertLinkedList.head =new Node(12);
        insertLinkedList.head.next =new Node(15);
        insertLinkedList.head.next.next =new Node(5);
        insertLinkedList.head.next.next.next =new Node(2);
        insertLinkedList.printList(head);
        Node revNode = reversedList(head);
      insertLinkedList.printList(revNode);




    }

    private static Node reversedList(Node head) {
        Node prev =null;
        Node currentNode =head;
        Node next =null;
        while(currentNode!=null){
            next =currentNode.next;
            currentNode.next =prev;
           prev= currentNode;
           currentNode =next;
        }

        return head=prev;
    }

    private void printList(Node node) {

        while(node!=null){
            System.out.println("head. = " + node.d);
            node =node.next;
        }
        
    }

}
