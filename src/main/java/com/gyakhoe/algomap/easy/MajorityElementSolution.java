package com.gyakhoe.algomap.easy;

public class MajorityElementSolution {

    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for(int number : nums) {
            if(count == 0) {
                candidate = number;
            }
            count += (number == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
