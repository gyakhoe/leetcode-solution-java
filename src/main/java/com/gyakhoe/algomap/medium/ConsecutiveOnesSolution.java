package com.gyakhoe.algomap.medium;

public class ConsecutiveOnesSolution {

    public int longestOnes(int[] nums, int k) {

        // Lets initialize some values
        int longestOnes = 0;
        int n = nums.length;
        int left = 0;
        int numberOfZero = 0;

        for(int right = 0; right < n; right ++) {

            if(nums[right] == 0) {
                numberOfZero++;
            }

            while (numberOfZero > k) {
                if(nums[left] == 0) {
                    numberOfZero--;
                }
                left++;
            }

            int window  = (right - left) + 1;
            longestOnes = Math.max(longestOnes , window);


        }
        return longestOnes;
    }
}
