package com.gyakhoe.algomap.medium;

import java.util.*;

public class TopKthFrequentElementSolution {

    public int[] topKFrequency(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.getValue(), b.getValue())
        );

        for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if(heap.size() < k) {
                heap.offer(entry);
            }else {
                heap.offer(entry);
                heap.poll();
            }
        }

        int[] topK  = new int[k];
        for(int i = k - 1; i >= 0; i--) {

            topK[i] = Objects.requireNonNull(heap.poll()).getKey();
        }

        return topK;
    }
}
