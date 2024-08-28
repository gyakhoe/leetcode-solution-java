package com.gyakhoe.algomap.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSequenceSolution {


    public int longestSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int number : nums) {
            numSet.add(number);
        }

        int longest = 0;
        for(int number : numSet) {
            if(!numSet.contains(number -1)) {
                int length = 1;
                int nextNumber = number + 1;
                while(numSet.contains(nextNumber)) {
                    length++;
                    nextNumber++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
