package com.gyakhoe.algomap.easy;

public class BinarySearchSolution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int middle = (int) (double) ((left + right) / 2);
            int middleNumber = nums[middle];
            if(middleNumber == target) {
                return middle;
            }else if(middleNumber > target) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }

        return -1;
    }

}
