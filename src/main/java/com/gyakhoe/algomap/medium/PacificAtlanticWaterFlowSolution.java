package com.gyakhoe.algomap.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlowSolution {


    public List<List<Integer>>  pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        if(heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Queues for BFS
        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        // Initialize the borders for both oceans;
        for(int i = 0; i < m; i++) {
            pacificQueue.offer(new int[]{i, 0}); // Top edge (pacific)
            atlanticQueue.offer(new int[]{i, n -1}); // Top edge (atlantic)
             pacific[i][0] = true;
            atlantic[i][n-1] = true;
        }

        for(int j = 0; j < n; j++) {
            pacificQueue.offer(new int[]{0, j});
            atlanticQueue.offer(new int[]{m -1, j});
            pacific[0][j] = true;
            atlantic[m -1][j] = true;
        }

        bfs(heights, pacificQueue, pacific);
        bfs(heights, atlanticQueue, atlantic);

        // Collect cells that can flow to both oceans
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }
        return result;
    }


    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};

        while(!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] dir: directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) continue;
                if(visited[newRow][newCol]) continue;
                if(heights[newRow][newCol] < heights[row][col]) continue;

                visited[newRow][newCol] = true;
                queue.offer(new  int[]{newRow, newCol});
            }
        }
    }
}
