package com.company;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        String a = "abide";
//        System.out.println(StringReverse.reverse(a));

//        String op = "())(()()";
//
//        Expression expression = new Expression();
//        System.out.println(expression.isBalanced(op));

        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(90);
        arrayStack.push(80);
        arrayStack.push(70);
        arrayStack.push(60);
        arrayStack.push(50);
        arrayStack.push(40);
        arrayStack.pop();
        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.empty());
    }


}
