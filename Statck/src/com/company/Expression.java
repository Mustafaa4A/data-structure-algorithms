package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('(', '{', '<', '[');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', '>', ']');

    public boolean isBalanced(String equation){
        Stack<Character> stack = new Stack<>();
        for (char ch:equation.toCharArray()){
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)){
                if (stack.empty()) return false;

                char top = stack.pop();
                if (!bracketsMatch(ch, top)) return false;
            }
        }
         return stack.empty();
    }

    public int longestParenthesisedSubstring(String str){
        Stack<Character> stack = new Stack<>();
        int path = 0;
        for (char ch:str.toCharArray()){
            if (isLeftBracket(ch))
                stack.push(ch);
            if (isRightBracket(ch)){
                if (stack.empty()) {
                    continue;
                }
                char top= stack.peek();

            }
        }
        return -1;
    }

    private boolean isLeftBracket(char ch){
        return  leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left)==rightBrackets.indexOf(right);
    }
}
