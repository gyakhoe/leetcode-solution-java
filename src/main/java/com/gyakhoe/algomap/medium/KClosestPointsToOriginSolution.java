package com.gyakhoe.algomap.medium;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOriginSolution {

    public int[][] kClosestPoints(int[][] points, int k) {

        Queue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    int distA = a[0] * a[0] + a[1] * a[1];
                    int distB = b[0] * b[0] + b[1] * b[1];
                    return Integer.compare(distB, distA);
                }
        );

        for(int[] point : points) {
            maxHeap.offer(point);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        return  result;
    }
}
