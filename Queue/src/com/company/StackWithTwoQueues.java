package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;


    public StackWithTwoQueues(){
        queue1=new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int item){
        if (queue1.isEmpty()){
            queue1.add(item);
        }else{
            while (!queue1.isEmpty()){
                queue2.add(queue1.remove());
            }
            queue1.add(item);
            while (!queue2.isEmpty()){
                queue1.add(queue2.remove());
            }
        }

    }
    public void pop(){
        if (isEmpty()) throw new IllegalStateException();
        queue1.remove();
    }

    public int peek(){
        if (isEmpty()) throw new IllegalStateException();
        return queue1.peek();
    }

    public int size(){
        return queue1.size();
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }

    @Override
    public String toString(){
        return queue1.toString();
    }
}
