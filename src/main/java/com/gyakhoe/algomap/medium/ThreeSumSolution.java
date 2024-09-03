package com.gyakhoe.algomap.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSolution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result  = new ArrayList<>();
        int n = nums.length ;

        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int low = i + 1;
            int high = n -1;

            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low ++;
                    high --;
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(low< high && nums[high] == nums[high + 1]) high --;

                }else if(sum < 0) {
                    low ++;
                }else {
                    high --;
                }
            }

        }
        return result;

    }

}