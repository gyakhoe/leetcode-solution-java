package com.gyakhoe.algomap.easy;

public class ValidSquareSolution {

    public boolean perfectSquare(int num) {

        int left = 1;
        int right = num;
        while(left <= right) {
            int middle = (left + right) / 2;
            // Use it for overflow
            long squaredNumber = (long) middle * middle;
            if(num == squaredNumber) {
                return true;
            }else if(squaredNumber < num) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return false;
    }
}
