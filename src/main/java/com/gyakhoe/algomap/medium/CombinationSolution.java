package com.gyakhoe.algomap.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSolution {

    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> solution = new ArrayList<>();


    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k);
        return ans;
    }

    private void backtrack(int n, int k) {

        if(solution.size() == k) {
            ans.add(new ArrayList<>(solution));
            return;
        }

        int stillNeed = k - solution.size();

        if(n > stillNeed) {
            backtrack(n - 1, k);
        }

        solution.add(n);
        backtrack(n - 1, k);
        solution.remove(solution.size() - 1);

    }
}
