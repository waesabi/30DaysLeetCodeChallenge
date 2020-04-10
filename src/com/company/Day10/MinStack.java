package com.company.Day10;

import java.util.ArrayList;
import java.util.Stack;

// Accepted
public class MinStack {
    ArrayList<Integer> list;
    Stack<Integer> minStack;
    public MinStack() {
        list = new ArrayList<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        list.add(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        }
        else {
            int top = minStack.peek();
            if (x <= top) {
                minStack.push(x);
            }
        }

        System.out.println("minStack: " + minStack);
    }

    public void pop() {
        System.out.println("list: " + list);
        System.out.println("minStack: " + minStack);
        if (list.size() != 0) {
            int last = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            if (!minStack.isEmpty()) {
                int top = minStack.peek();
                System.out.println("top: " + top + " last: " + last);
                System.out.println("minStack: " + minStack);
                if (top == last) {
                    minStack.pop();
                }
            }
        }

    }

    public int top() {
        if (list.size() != 0) {
            return list.get(list.size() - 1);
        }
        else {
            return -1;
        }
    }

    public int getMin()  {
        System.out.println("getMinStack: " + minStack);
        if (minStack.isEmpty()) { return -1; }
        return minStack.peek();
    }

}
