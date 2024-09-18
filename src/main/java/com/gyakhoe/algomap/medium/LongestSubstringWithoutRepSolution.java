package com.gyakhoe.algomap.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepSolution {


    public int lengthOfLongestSubString(String s) {

        int left = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int longest = 0;

        for(int right = 0; right < n; right++){

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int window = (right - left) + 1;
            longest = Math.max(longest, window);
        }

        return longest;
    }
}
