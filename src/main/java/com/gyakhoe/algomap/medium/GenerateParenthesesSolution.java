package com.gyakhoe.algomap.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesSolution {

    public List<String> generateParentheses(int n) {
        List<String> ans = new ArrayList<>();

        backtrack(0, 0, new StringBuilder(), n * 2, ans);

        return ans;
    }

    private void backtrack(int openP, int closeP, StringBuilder solution, int max, List<String> ans) {

        if(solution.length() == max){
            ans.add(solution.toString());
            return;
        }

        if(openP < max / 2) {
            solution.append("(");
            backtrack(openP + 1, closeP, solution, max, ans);
            solution.deleteCharAt(solution.length() - 1);
        }

        if(closeP < openP){
            solution.append(")");
            backtrack(openP, closeP + 1, solution, max, ans);
            solution.deleteCharAt(solution.length() - 1);
        }
    }
}
