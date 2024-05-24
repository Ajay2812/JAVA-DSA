package com.ajay;

import java.util.Arrays;

public class BsInSorted2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {8, 9, 10, 11},
                {12, 13, 14, 15},
                {20, 23, 24, 25}
        };
        int target = 15;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] matrix,int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1,-1};
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Binary search on rows
        int rowStart = 0;
        int rowEnd = numRows - 1;
        while (rowStart <= rowEnd) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[rowMid][0] <= target && target <= matrix[rowMid][numCols - 1]) {
                // Perform a binary search on this row
                int colStart = 0;
                int colEnd = numCols - 1;
                while (colStart <= colEnd) {
                    int colMid = colStart + (colEnd - colStart) / 2;

                    if (matrix[rowMid][colMid] == target) {
                        return new int[]{rowMid,colMid};
                    } else if (matrix[rowMid][colMid] < target) {
                        colStart = colMid + 1;
                    } else {
                        colEnd = colMid - 1;
                    }
                }
                return new int[]{-1,-1}; // Target is not in this row
            } else if (matrix[rowMid][0] < target) {
                rowStart = rowMid + 1;
            } else {
                rowEnd = rowMid - 1;
            }
        }

        return new int[]{-1,-1};
    }
}


