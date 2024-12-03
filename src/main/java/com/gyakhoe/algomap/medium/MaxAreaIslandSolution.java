package com.gyakhoe.algomap.medium;

public class MaxAreaIslandSolution {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        if(grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;

        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col ++) {
                if(grid[row][col] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, row, col));
                }
            }
        }



        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        if(row < 0 || col < 0 || col >= cols || row >= rows || grid[row][col] == 0) {
            return 0;
        }
        int area = 1;
        grid[row][col] = 0;
        area += dfs(grid, row + 1, col);
        area += dfs(grid, row  - 1, col);
        area += dfs(grid, row, col + 1);
        area += dfs(grid, row, col - 1);

        return area;
    }
}
