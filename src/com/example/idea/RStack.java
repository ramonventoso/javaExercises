package com.example.idea;

/**
 * Created by rventoso on 15/12/2017.
 */
public class RStack {
    Node top;

    public void push(int input) {
        Node newNode = new Node(input);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    public int pop(){
        if (top == null) return -1;
        int res = top.data;
        top = top.next;
        return res;
    }

    public int peek() {
        if (top != null) {
            return top.data;
        }
        else {
            return -1;
        }
    }
}
