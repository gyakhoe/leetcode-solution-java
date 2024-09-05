package com.gyakhoe.algomap.medium;

import java.util.Stack;

public class DailyTemperatureSolution {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            while (!stack.isEmpty() && stack.peek()[0] < currentTemp) {
                int[] prevTemp = stack.pop();
                answer[prevTemp[1]] = i - prevTemp[1];
            }
            stack.push(new int[] {currentTemp, i});
        }
        return answer;
    }
}
