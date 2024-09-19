package com.gyakhoe.algomap.medium;

import java.util.Arrays;

public class PermutationString {

    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0; i < n1; i++){
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(count1, count2)) {
            return true;
        }

        for(int i = n1; i< n2; i++) {
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i - n1) - 'a' ]--;

            if(Arrays.equals(count1, count2)) {
                return true;
            }
        }


        return false;

    }

}
