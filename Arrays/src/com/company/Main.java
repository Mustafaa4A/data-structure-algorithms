package com.company;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
	// write your code here
        Array numbers = new Array(3);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(80);

        System.out.println(numbers);
        System.out.println(numbers.indexOf(30));
        numbers.removeAt(1);
        System.out.println(numbers);
        System.out.println(numbers.max());

        int[] arr = {12,30,40,89,10,90};
        numbers.intersect(arr);
        numbers.reverse();
        System.out.println("");
        numbers.insertAt(100,0);
        System.out.println(numbers);
    }
}
