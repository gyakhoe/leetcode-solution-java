package com.gyakhoe.algomap.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public int[] towSum(int[] nums, int target) {
        final int[] result = new int[2];
        final Map<Integer, Integer> arrayMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            arrayMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            final int requiredValue = target - nums[i];
            if(arrayMap.containsKey(requiredValue) && arrayMap.get(requiredValue) != i) {
                result[0] = i;
                result[1] = arrayMap.get(requiredValue);
            }
        }


        return result;
    }
}
