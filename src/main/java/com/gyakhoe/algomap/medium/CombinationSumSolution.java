package com.gyakhoe.algomap.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumSolution {

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> solution = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, 0, 0, target);
        return  result;
    }

    private void backtrack(int[] candidates, int index  , int currentSum, int target) {

        if(currentSum == target) {
            result.add(new ArrayList<>(solution));
            return;
        }

        if(currentSum > target || index == candidates.length){
            return;
        }

        // Skip the current candidate
        backtrack(candidates, index + 1, currentSum, target);

        // Include the current candidate
        solution.add(candidates[index]);
        backtrack(candidates, index, currentSum + candidates[index], target);
        solution.remove(solution.size() - 1);
    }


}
