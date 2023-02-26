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
        System.out.println(numbers.indexOf(400));
//        numbers.print();
//        System.out.print("max item ");
//        System.out.println(numbers.max());
//        numbers.removeAt(3);
//        System.out.println(numbers.length);


//        int[] arr = {12,30,40,89,10,90};
//        numbers.intersect(arr);


//        System.out.println("before reverse");
//        numbers.print();
//        numbers.reverse();
//
//        System.out.println("after reverse");
//        numbers.print();
        //removeAt
        //indexOf

        numbers.print();
        numbers.insertAt(78, 2);
        numbers.insertAt(98, 4);
        numbers.insertAt(98, 0);
        numbers.insertAt(98, 10);
        numbers.print();
    }
}
