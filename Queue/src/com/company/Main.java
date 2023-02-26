package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        ArrayQueue queue = new ArrayQueue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue);
//
//        queue.enqueue(50);
//        queue.enqueue(60);
//        queue.enqueue(70);
//        System.out.println(queue);
        StackQueue stackQueue = new StackQueue();
        stackQueue.enqueue(10);
        stackQueue.enqueue(20);
        stackQueue.enqueue(30);
        System.out.println(stackQueue);
        stackQueue.dequeue();
        System.out.println(stackQueue);
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }


}
