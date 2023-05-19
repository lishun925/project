package com.java.study;

public class Node {

    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Node reverse = reverse(node1);
        System.out.println(reverse.value);

    }

}