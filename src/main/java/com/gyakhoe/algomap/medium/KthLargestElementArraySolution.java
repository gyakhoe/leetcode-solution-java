package com.gyakhoe.algomap.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementArraySolution {


    public int findKthLargestElementUsingMaxHeap(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums) {
            maxHeap.add(num);
        }

        int result = 0;
        for(int i = 0; i < k; i++) {
            result = maxHeap.poll();
        }

        return result;
    }

    public int findKthLargestElementUsingMinHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            if(minHeap.size() < k) {
                minHeap.add(num);
            }else {
                if(!minHeap.isEmpty() && num > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(num);
                }
            }
        }
        return !minHeap.isEmpty()? minHeap.peek() : 0;
    }

}

