package com.gyakhoe.algomap.medium;

public class MinSubArraySolution {

    public int minSubArrayLen(int target, int[] nums) {

        // Let's create a minLength, but assign it the max value
        int minLength = Integer.MAX_VALUE;

        // Sliding window problem
        int left = 0;
        int sum = 0;

        for(int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while(sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        // If you find min length is unchanged, return 0;
        return minLength == Integer.MAX_VALUE  ? 0 : minLength;
    }
}
