package com.gyakhoe.algomap.medium;

import java.util.Arrays;

public class KokoEatingBananaSolution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = Arrays.stream(piles).max().orElse(1);

        while (left < right) {
            int middle = (left + right) / 2;
            if(canFinish(piles, h, middle)) {
                right =  middle;
            }else {
                left = middle + 1;
            }
        }
        return left;

    }

    private boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for(int pile: piles) {
            hours += (pile + k - 1) / k;
        }

        return hours <= h;
    }
}
