package com.gyakhoe.algomap.hard;

public class TrappingRainWaterSolution {

    public int trapWater(int[] height) {
        // Initial setup of values
        int trappedWater = 0;
        int leftWall = 0;
        int rightWall = 0;
        int arraySize = height.length;

        // Create two array to store max of lefts and rights to
        // their current corresponding index of given array
        // of heights
        int[] maxOfLefts = new int[arraySize];
        int[] maxOfRights = new int[arraySize];


        // Run a loop to fill the max of lefts and rights
        // to each index
        for(int i = 0; i < arraySize; i++) {
            int reverseIndex = (arraySize - 1) - i;
            maxOfLefts[i] = leftWall;
            maxOfRights[reverseIndex] = rightWall;
            leftWall = Math.max(leftWall, height[i]);
            rightWall = Math.max(rightWall, height[reverseIndex]);
        }

        // Based on current index, compared the min of calculated
        // max of left and max of right
        // reduce the height at current index from the available space
        // If below zero is the answers, use 0 instead
        for(int i = 0; i < arraySize; i++) {
            int currentSpace = Math.min(maxOfLefts[i], maxOfRights[i]);
            int actualSpace = currentSpace - height[i];
            trappedWater += Math.max(0, actualSpace);
        }

        return trappedWater;


    }

}
