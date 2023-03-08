package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;
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

//        statuc queue
//        StackQueue stackQueue = new StackQueue();
//        stackQueue.enqueue(10);
//        stackQueue.enqueue(20);
//        stackQueue.enqueue(30);
//        System.out.println(stackQueue);
//        stackQueue.dequeue();
//        System.out.println(stackQueue);

//        PriorityQueue queue = new PriorityQueue();
//        queue.enqueue(6);
//        queue.enqueue(7);
//        queue.enqueue(3);
//        queue.enqueue(9);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(8);
//        queue.enqueue(6);
//        System.out.println(queue);
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue);

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.add(50);
//        queue.add(60);
//        queue.add(70);
//        queue.add(80);
//        System.out.println("Queue input : "+queue);
//        QueueReverser.reverse(5,queue);
//        System.out.println(queue);
//        LinkedListQueue linkedListQueue = new LinkedListQueue();
//        linkedListQueue.enqueue(12);
//        linkedListQueue.enqueue(20);
//        linkedListQueue.enqueue(30);
//        linkedListQueue.enqueue(40);
//        System.out.println(linkedListQueue);
//        linkedListQueue.dequeue();
//        linkedListQueue.dequeue();
//        System.out.println(linkedListQueue);

        StackWithTwoQueues stack = new StackWithTwoQueues();
        System.out.println(stack);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
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
