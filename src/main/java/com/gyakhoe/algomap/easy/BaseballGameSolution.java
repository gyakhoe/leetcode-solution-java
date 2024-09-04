package com.gyakhoe.algomap.easy;

import java.util.Stack;

public class BaseballGameSolution {

    public int calPoint(String[] operations) {
        Stack<Integer> callStack = new Stack<>();
        for(String operation: operations) {
            switch(operation) {
                case "+":
                    int top = callStack.pop();
                    int newTop = (top + callStack.peek());
                    callStack.push(top);
                    callStack.push(newTop);
                    break;
                case "D":
                    callStack.push(callStack.peek() * 2);
                    break;
                case "C":
                    callStack.pop();
                    break;
                default: callStack.push(Integer.parseInt(operation));
            }
        }

        int points = 0;
        while(!callStack.isEmpty()) {
            points += callStack.pop();
        }
        return points;

    }
}
