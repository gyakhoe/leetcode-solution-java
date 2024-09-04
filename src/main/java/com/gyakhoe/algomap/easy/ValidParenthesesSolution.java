package com.gyakhoe.algomap.easy;

import java.io.CharArrayWriter;
import java.util.Stack;

public class ValidParenthesesSolution {

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for(char c: s.toCharArray()) {

            if(c == '(' || c =='{' || c=='[') {
                brackets.push(c);
            }else {
                if(brackets.isEmpty()) {
                    return false;
                }
                char top = brackets.pop();
                if(
                        c == ')' && top != '(' ||
                                c == '}' && top != '{' ||
                                c == ']' && top != '['
                ){
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
