package com.company;

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {

        System.out.println(backspaceCompare("a#c","b"));
    }

    // Accepted
    public static boolean backspaceCompare(String S, String T) {
        if (constructString(S).equals(constructString(T))) {
            return true;
        }
        return false;
    }

    public static String constructString(String s) {
        StringBuilder builder = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '#') {
                if (!stack.isEmpty()) { stack.pop(); }
            }
            else {
                stack.push(temp);
            }
        }
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.toString();
    }

}
