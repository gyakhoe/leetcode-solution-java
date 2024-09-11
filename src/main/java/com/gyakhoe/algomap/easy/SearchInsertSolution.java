package com.gyakhoe.algomap.easy;

public class SearchInsertSolution {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int middle = (int) (double) ((left + right) / 2);
            int middleNumber = nums[middle];
            if(middleNumber > target) {
                right = middle -1;
            }else if(middleNumber < target) {
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return left;
    }
}
