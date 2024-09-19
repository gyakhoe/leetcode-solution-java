package com.gyakhoe.algomap.medium;

public class LongestRepeatingCharacterSolution {

    public int characterReplacement(String s, int k) {
        int maxCount = 0;
        int left = 0;
        int longest = 0;
        int[] charCounts = new int[26];

        for(int right = 0; right < s.length(); right++) {

            maxCount = Math.max(maxCount,
                    ++charCounts[s.charAt(right) - 'A']);

            while(((right - left) + 1) - maxCount > k){
                charCounts[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(longest, (right - left) + 1);
        }
        return longest;
    }
}
