package com.gyakhoe.algomap.medium;

public class ContainerWithMostHeightSolution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentWidth = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = currentHeight * currentWidth;
            maxArea = Math.max(currentArea, maxArea);
            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}
