package com.company;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] queue;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue(){
        queue = new int[5];
        size = 0;
        head = 0;
        tail = 0;
    }

    public void enqueue(int item){
        if (size == queue.length) throw new RuntimeException();

        queue[tail] = item;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public void dequeue(){
        if (size == 0) throw new RuntimeException();

        queue[head] = 0;
        head = (head + 1) % queue.length;
        size--;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return queue.length==size;
    }

    @Override
    public String toString() {
        int[] elements = new int[size];
        int index = 0;
        for (int i=head; i<tail; i++){
            elements[index++] = queue[i];
        }
        return Arrays.toString(queue);
    }
}
