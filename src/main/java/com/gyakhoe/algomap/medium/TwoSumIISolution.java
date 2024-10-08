package com.gyakhoe.algomap.medium;

import java.util.Arrays;

public class TwoSumIISolution {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                result[0] = left +1;
                result[1] = right + 1;
                return result;
            }else if(sum < target) {
                left ++;
            }else {
                right --;
            }
        }
        return result;
    }
}
