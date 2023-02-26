package com.company;

import java.util.Stack;

public class StringReverse {
    public static String reverse(String str){
        if (str==null) throw  new IllegalArgumentException();

        StringBuilder reverse = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char i:str.toCharArray())
            stack.push(i);

        while (!stack.empty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
