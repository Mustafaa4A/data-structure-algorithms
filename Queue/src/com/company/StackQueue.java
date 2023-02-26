package com.company;

import java.util.Stack;

public class StackQueue {
    private int size;
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public StackQueue(){
        size = 0;
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item){
        stack1.push(item);
        size++;
    }

    public void dequeue(){
        if (isEmpty())
            throw  new IllegalStateException();

        moveStuckOne2StuckTwo();

        stack2.pop();
        size--;
    }

    private void moveStuckOne2StuckTwo() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public boolean isEmpty(){
        return  stack1.isEmpty() && stack2.isEmpty();
    }

    public void peek(){
        if (isEmpty())
            throw  new IllegalStateException();

        moveStuckOne2StuckTwo();

        stack2.peek();
        size--;
    }

    @Override
    public String toString(){
        return stack1.toString();
    }
}
