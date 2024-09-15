package com.gyakhoe.algomap.medium;

public class SearchInRotatedArraySolution {

    public int search(int[] nums, int target){
        int size = nums.length;

        // Left the minimum index or the pivot point
        int left = 0;
        int right = size - 1;

        while(left < right){
            int middle = (left + right) / 2;
            if(nums[middle] > nums[right]){
                left = middle + 1;
            }else {
                right = middle;
            }
        }
        int minIndex = left;

        // If the array is not rotated
        if(minIndex == 0) {
            right = size - 1;
        }else if(target >= nums[0] && target <= nums[minIndex]) {
            // When the target is in the first half
            left = 0;
            right = minIndex;
        }else {
            // when the target is in second half
            left = minIndex + 1;
            right = size - 1;
        }

        // Perform a binary search for the assigned left and right
        while(left <= right){
            int middle = (left + right) / 2;
            if(target == nums[middle]) {
                return middle;
            } else if(target < nums[middle]) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
