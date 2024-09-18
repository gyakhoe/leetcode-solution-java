package com.gyakhoe.algomap.easy;

public class MaxAverageSubArraySolution {

    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0;
        int currentMax = 0;
        int n = nums.length;

        for(int i = 0; i < k; i++) {
            currentMax += nums[i];
        }
        maxAverage= currentMax / k;

        for(int i = k; i < n; i++) {
            currentMax += nums[i];
            currentMax -= nums[i - k];

            double average = (double) currentMax / k;
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }
}
