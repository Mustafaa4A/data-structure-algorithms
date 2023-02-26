package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStack {
    private int size;
    private int[] array;

    public ArrayStack(){
        array = new int[5];
    }

    public void push(int item){
        if (size==array.length){
            shrinkArray();
        }
        array[size++] = item;
    }

    public void pop(){
        if (empty()) throw new IllegalStateException();

        array[--size] = 0;
    }
    public int peek(){
        if (empty()) throw new IllegalStateException();

        return array[size-1];
    }

    public boolean empty(){
        return size==0;
    }

    private void shrinkArray() {
        int[] newArray = new int[array.length*2];
        System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;
    }

    @Override
    public String toString(){
        int[] contents = Arrays.copyOfRange(array, 0, size);
        return Arrays.toString(contents);
    }
}
