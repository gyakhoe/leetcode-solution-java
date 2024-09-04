package com.gyakhoe.algomap.medium;

import java.util.Stack;

public class ReversePolishNotationSolution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for(String token : tokens) {

            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int first = numbers.pop();
                int second = numbers.pop();
                switch (token) {
                    case "-" : numbers.push(second - first); break;
                    case "*" : numbers.push( second * first); break;
                    case "/" : numbers.push(second / first); break;
                    default: numbers.push(second + first); break;
                }
            }else {
                numbers.push(Integer.parseInt(token));
            }
        }

        return numbers.pop();
    }
}
