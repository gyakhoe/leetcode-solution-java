package com.gyakhoe.algomap.easy;

public class SquaresForSortedArray {

    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length -1;
        int counter = right;
        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[counter] = nums[left] * nums[left];
                left++;
            }else {
                result[counter] = nums[right] * nums[right];
                right--;
            }
            counter--;
        }
        return result;
    }




}
