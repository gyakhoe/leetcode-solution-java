package com.gyakhoe.algomap.medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSodokuSolution {

    public boolean isValidSodoku(char[][] board) {

        // Check for validity in rows
        for(int i =0; i < 9; i++) {
            final Set<Character> rowSet = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                final char item = board[i][j];
                if(item != '.' && !rowSet.add(item)){
                    return false;
                }
            }
        }

        // Check for validity in columns
        for(int i = 0; i < 9; i++) {
            final Set<Character> colSet = new HashSet<>();
            for(int j=0; j<9; j++) {
               final char item  = board[j][i];
               if(item != '.' && !colSet.add(item)) {
                   return false;
               }
            }
        }

        // Check for validity in boxes
        // Set the starting grid of 3x3 for each boxes
        int[][] starts = {
                {0,0} , {0,3}, {0,6},
                {3,0} , {3,3}, {3,6},
                {6,0} , {6,3}, {6,6},
        };
        for(int[] start: starts) {
            Set<Character> boxSet = new HashSet<>();
            for(int row = start[0]; row < start[0 ] + 3; row ++) {
                for(int col = start[1]; col < start[1] + 3; col++) {
                    final char item = board[row][col];
                    if(item != '.' && !boxSet.add(item)) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}
