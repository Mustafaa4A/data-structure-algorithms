package com.company;

public class LinkedListQueue {
    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(int item){
        var node = new Node(item);
        if (isEmpty()){
            head = node;
        }else{
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void dequeue(){
        if (isEmpty()) throw new IllegalStateException();
        if (size==1){
            head = null;
            tail = null;
        }else{
            head = head.next;
        }
        size--;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString(){
        Node current = head;
        while (current!=null){
            System.out.print(current.value+" ");
            current = current.next;
        }
        return "";
    }
}
