package com.gyakhoe.algomap.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> sCounter = new HashMap<>();
        for(char value : s.toCharArray()) {
            sCounter.put(value, sCounter.getOrDefault(value, 0) + 1);
        }

        for(char value : t.toCharArray()) {
            int count = sCounter.getOrDefault(value, 0);
            if(count == 0) {
                return false;
            }
            sCounter.put(value, count-1);
        }
        return true;
    }
}
