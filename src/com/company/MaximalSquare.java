package com.company;

import java.util.HashMap;

public class MaximalSquare {

    // Accepted
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        if (rows < 1) { return 0; }
        int cols = matrix[0].length;
        int maxSize = 0;
        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(dp[i-1][j-1],
                            Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                    maxSize = Math.max(maxSize, dp[i][j]);
                }
            }
        }
        return (maxSize * maxSize);
    }

}
