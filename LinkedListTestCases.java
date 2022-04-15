package com.testcases;

public class LinkedListTestCases {
	static class Node {
        int data;
        Node next;
        Node(int tmp) {data = tmp;}
    }
 
    static Node findNthNodeFromLastV1(Node head, int n) {
 
        int length = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            length++;
        }
        System.out.println("length: "+length);
        for(int i=0;i<length-n;i++) {
            head = head.next;
        }
        return head;
    }
 
    static Node findNthNodeFromLastV2(Node head, int n) {
 
        Node refNode = head;
        Node mainNode = head;
        if(head == null) {
            return null;
        }
        for(int i=0;i<n;i++) {
            if(refNode == null) {
                System.out.println("The n input size is more than linked list size");
                return null;
            }
            refNode = refNode.next;
        }
 
        while(refNode != null) {
            mainNode = mainNode.next;
            refNode = refNode.next;
        }
 
        return mainNode;
    }
 
    public static void main(String[] a) {
 
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
 
        Node nthNode = findNthNodeFromLastV2(n1, 2);
        System.out.println("Nth node value: "+nthNode.data);
    }
}
