package com.gyakhoe.algomap.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    1189. Maximum Number of Balloons
    Hint
    Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as
    possible.
    You can use each character in text at most once. Return the maximum number of instances that can be formed.
 */
public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {

        if(text.length() < "balloons".length()){
            return 0;
        }

        Map<Character, Integer> balloonMap = new HashMap<>();

        for(char c: text.toCharArray()) {
            if(c == 'b' || c=='a' || c=='l' || c=='o' || c=='n') {
                balloonMap.put(c, balloonMap.getOrDefault(c, 0) + 1);
            }
        }

        int minCount = balloonMap.getOrDefault('b',0);
        minCount = Math.min(minCount, balloonMap.getOrDefault('a', 0));
        minCount = Math.min(minCount, balloonMap.getOrDefault('l', 0) /2);
        minCount = Math.min(minCount, balloonMap.getOrDefault('o', 0) / 2);
        minCount = Math.min(minCount, balloonMap.getOrDefault('n', 0));
        return minCount;

    }

    public static void main(String[] args) {
        MaxNumberOfBalloons solution = new MaxNumberOfBalloons();
        String text1 = "nlaebolko";
        System.out.println(solution.maxNumberOfBalloons(text1));  // Output: 1

        String text2 = "loonbalxballpoon";
        System.out.println(solution.maxNumberOfBalloons(text2));  // Output: 2

        String text3 = "leetcode";
        System.out.println(solution.maxNumberOfBalloons(text3));  // output : 0

        String text4 = "balloon";
        System.out.println(solution.maxNumberOfBalloons(text4));  // Output: 1
    }

}
