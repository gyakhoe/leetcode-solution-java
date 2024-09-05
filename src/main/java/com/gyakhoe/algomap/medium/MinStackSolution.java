package com.gyakhoe.algomap.medium;

import java.util.Stack;

public class MinStackSolution {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStackSolution() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(!minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }else {
            minStack.push(minStack.peek());
        }
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public  int getMin() {
        return minStack.peek();
    }
}
