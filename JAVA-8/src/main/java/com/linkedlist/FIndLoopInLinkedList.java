package com.linkedlist;

/**
 * @author vikas.bhardwaj3
 * 2/28/20209:04 PM2020
 */


public class FIndLoopInLinkedList {
    static Node head;

    public static void main(String[] args) {
        FIndLoopInLinkedList fIndLoopInLinkedList = new FIndLoopInLinkedList();
        head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = head;
        findloop(head);
      //  ptintList(head);


    }

    private static void findloop(Node head) {
        Node slop_p =head;
        Node fast_p =head;

        while(slop_p!=null&&fast_p!=null&&fast_p.next!=null){
            slop_p =slop_p.next;
            fast_p=fast_p.next;
            if(slop_p==fast_p){
                System.out.println("loop found");
            }
        }
    }

    private static void ptintList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
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
