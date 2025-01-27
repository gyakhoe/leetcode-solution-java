package com.gyakhoe.algomap.medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {

        if(grid == null || grid.length == 0) return -1;

        int rows = grid.length;
        int cols = grid[0].length;
        int freshOranges = 0;
        Queue<int[]> queue = new LinkedList<>();

        final int FRESH = 1, EMPTY = 0, ROTTEN = 2;

        // Let's check for initial rotten and count fresh oranges
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == ROTTEN) {
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j] == FRESH){
                    freshOranges++;
                }
            }
        }

        if(freshOranges == 0) return 0;

        // Let's see if its possible to contaminate all oranges
        int minutes = 0;
        int[][] directions = {{0,1},{1,0},{0,-1},{-1, 0}};

        while(!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for(int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                for(int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    // Check in the direction set for fresh orange
                    if(newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == FRESH) {
                        grid[newRow][newCol] = ROTTEN;
                        queue.offer(new int[]{newRow, newCol});
                        freshOranges--;
                        rotted = true;
                    }
                }
            }
            if(rotted) minutes++;
        }

        return freshOranges == 0 ? minutes : -1;
    }
}
