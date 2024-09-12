package com.gyakhoe.algomap.medium;

public class Search2DMatrixSolution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int columns = matrix[0].length;
        int totalElement = row * columns;
        int left = 0;
        int right = totalElement - 1;

        while (left <= right){
            int middle = (left + right) / 2;
            int currentRow = middle / columns;
            int currentColumn = middle % columns;
            int middleElement = matrix[currentRow][currentColumn];

            if(target == middleElement){
                return true;
            }else if (target < middleElement) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return false;
    }
}
