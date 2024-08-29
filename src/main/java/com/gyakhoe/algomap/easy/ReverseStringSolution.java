package com.gyakhoe.algomap.easy;

import java.util.HashMap;
import java.util.Map;

public class ReverseStringSolution {

    public void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        final Map<Integer, Integer> numberMap = new HashMap<>();


    }
}
