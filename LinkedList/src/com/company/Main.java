package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        LinkedList list = new LinkedList();
//        list.addLast(8);
//        list.addFirst(89);
//        list.addLast(18);
//        list.addLast(10);
//        list.addLast(19);
        System.out.println(list.size());
        list.print();

//        list.deleteLast();
//        list.deleteLast();
//        System.out.println(list.size());
//        list.print();
//        System.out.println(list.contains(89));
//        System.out.println(list.contains(80));
//        System.out.println(list.indexOf(10));
//        list.addFirst(78);
        System.out.println(Arrays.toString(list.toArray()));
//        list.reverse();
//        System.out.println(Arrays.toString(list.toArray()));
//        list.reverse2();
//        System.out.println(Arrays.toString(list.toArray()));

//        System.out.println(list.getKthFromTheEnd(3));
//        list.printMiddle();
        list.addAt(90, 0);
        list.addAt(80, 1);
        list.addAt(40, 6);
        System.out.println(Arrays.toString(list.toArray()));
        list.removeAt(10);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
