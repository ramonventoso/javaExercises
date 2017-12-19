package com.example.idea;

/**
 * Created by rventoso on 15/12/2017.
 */
public class RTwoStackQueue {
    private RStack enqueueStack, dequeueStack;

    RTwoStackQueue(){
        enqueueStack = new RStack();
        dequeueStack = new RStack();
    }
    public void enqueue(int input) {
        enqueueStack.push(input);
    }

    public int dequeue() {
        if (dequeueStack.peek() == -1) {
            while(enqueueStack.peek() != -1) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }
}
