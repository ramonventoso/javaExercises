package com.example.idea;

/**
 * Created by Ramon on 2017-10-24.
 */
public class Node {
    int data;
    Node next;
    public Node(int d){
        data = d;
    }
    public void appendToTail(int d){
        Node tail = new Node(d);
        Node node = this;
        while (node.next != null){
            node = node.next;
        }
        node.next = tail;
    }
}
