package com.company;

import java.util.NoSuchElementException;

public class LinkedList {
    private int size;
    private Node first;
    private Node last;

    public  LinkedList(){
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public void addFirst(int item){
        Node node = new Node(item);
        if (isEmpty())
            first = last = node;
        else
            node.setNext(first);
            first = node;

        size++;
    }

    public void addLast(int item){
        Node node = new Node(item);
        if (isEmpty())
            first = last = node;
        else{
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first==last){
            first = last = null;
        }else{
            Node second = first.getNext();
            first.setNext(null);
            first = second;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        if (first==last){
            first = last = null;
        }else{
            Node previous = getPrevious(last);
            assert previous != null;
            previous.setNext(null);
            last = previous;
        }
        size--;
    }

    private Node getPrevious(Node node){
        Node current = first;
        while (current!=null){
            if (current.getNext()==node) return current;
            current  = current.getNext();
        }
        return null;
    }

    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while (current!=null){
            if (current.getValue()==item) return index;
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(int val){
      return indexOf(val)!=-1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
    
    public int[] toArray(){
        int[] arr = new int[size];
        var current = first;
        int index = 0;
        while (current!=null){
            arr[index++] = current.getValue();
            current = current.getNext();
        }
        return arr;
    }

    public void reverse(){
        if (isEmpty()) return;

        Node previous = first;
        Node current = previous.getNext();
        while (current!=null){
            Node next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        last = first;
        first = previous;
        last.setNext(null);

    }

    public void reverse2(){
        Node current = last;
        while (current!=null){
            if (current==first){
                current.setNext(null);
            }
            current.setNext(getPrevious(current));
            current = current.getNext();
        }
        Node temp = last;
        last = first;
        first = temp;
    }

    public int getKthFromTheEnd(int k){
        if (isEmpty()) throw   new IllegalStateException();

       Node a = first;
       Node b = first;
       for (int i=0; i<k-1; i++){
            b=b.getNext();
            if (b==null) throw new IllegalArgumentException();
       }
       while (b!=last){
           a = a.getNext();
           b = b.getNext();
       }

       return a.getValue();
    }

    public void printMiddle(){
        Node a = first;
        Node b = first;
        while (b!=last && b.getNext() != last){
            a = a.getNext();
            b = b.getNext().getNext();
        }
        if (b == last)
            System.out.println(a.getValue());
        else
            System.out.println(a.getValue()+" , "+a.getNext().getValue());
    }

    public void print(){
        Node current = first;
        while (current!=null){
            System.out.print(current.getValue()+" ");
            current = current.getNext();
        }
        System.out.println("");
    }


    public void addAt(int item, int index){

        if (isEmpty() || index == 0){
            addFirst(item);
            return;
        }
        if (index>=size){
            addLast(item);
            return;
        }
        Node node = new Node(item);
        Node previous = first;
        Node next = null;
        for (int i=0; i<index-1; i++)
            previous= previous.getNext();

        next = previous.getNext();
        previous.setNext(node);
        node.setNext(next);

        size++;
    }

    public void removeAt(int index){
        if (isEmpty() || index == 0){
            removeFirst();
            return;
        }

        if (index>=size){
            removeLast();
            return;
        }

        Node current = first;
        for (int i=0; i<index-1; i++)
            current = current.getNext();

        System.out.println(current.getValue());
        current.setNext(current.getNext().getNext());

        size--;

    }

}
