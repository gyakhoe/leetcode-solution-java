package com.gyakhoe.algomap.medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationSolution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, solution, result);

        return result;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> solution, List<List<Integer>> result) {

        if(solution.size() == nums.length) {
            result.add(new ArrayList<>(solution));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(used[i]) continue;

            solution.add(nums[i]);
            used[i] = true;
            backtrack(nums, used, solution, result);
            solution.remove(solution.size() - 1);
            used[i] = false;
        }
    }
}
