package com.gyakhoe.algomap.medium;

public class NumberOfIslandsSolution {

    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++){

                if(grid[row][col] == '1') {
                    numIslands++;
                    dfs(grid, row, col);
                }
            }
        }
        return  numIslands;
    }

    private void dfs(char[][] grid, int row, int col) {

        int rows = grid.length;
        int cols = grid[0].length;

        if(row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] =='0') {
            return;
        }
        grid[row][col] = '0';
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);

    }
}
