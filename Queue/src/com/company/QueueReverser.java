package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public static void reverse(int k, Queue<Integer> queue){
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue1 = new LinkedList<>();
        while (!queue.isEmpty() && index < k){
            stack.push(queue.remove());
            index++;
        }
        while (!queue.isEmpty()){
            queue1.add(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }

        while (!queue1.isEmpty()){
            queue.add(queue1.remove());
        }
    }
}
