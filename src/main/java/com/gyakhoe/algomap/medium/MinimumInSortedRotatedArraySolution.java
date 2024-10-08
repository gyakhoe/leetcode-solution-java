package com.gyakhoe.algomap.medium;

public class MinimumInSortedRotatedArraySolution {

    public int findMinimum(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int middle = (left + right ) / 2;
            if(nums[middle] > nums[right]) {
                left = middle + 1;
            }else {
                right = middle;
            }
        }

        return nums[left];
    }
}
