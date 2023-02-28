package com.company;

import java.util.Arrays;

public class PriorityQueue {
    private final int[] queue;
    private  int size;
    private  int head;
    private  int tail;

    public PriorityQueue(){
        queue = new int[10];
        size  = 0;
        head=0;
        tail=0;
    }

    public void enqueue(int item){
        if (isFull()) throw new RuntimeException();


        int i = shiftItemToInsert(item);
        queue[i]=item;

        tail = (tail + 1) % queue.length;
        size++;
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        int item = queue[head];
        queue[head]=0;
        head = (head + 1) % queue.length;
        size--;
        return item;
    }

    public boolean isEmpty(){
        return  size==0;
    }

    public boolean isFull(){
        return size == queue.length;
    }

    private int shiftItemToInsert(int item){
        int i;
        for (i=size-1; i>=0; i--){
            if (queue[i]>item){
                queue[i+1] = queue[i];
            }else{
                break;
            }
        }
        return i+1;
    }

    @Override
    public String toString() {
        int[] elements = new int[size];
        int index = 0;
        for (int i=head; i<tail; i++){
            elements[index++] = queue[i];
        }
        return Arrays.toString(elements);
    }
}
