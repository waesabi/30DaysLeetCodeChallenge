package com.company;

public class MinimumPathSum {

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        minPathSum(arr);
    }

    // Accepted - Easy Dp Problem
    public static int minPathSum(int[][] grid) {
        int rows = grid.length;
        if (rows < 1) { return 0; }
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];
        // 0th row
        for (int i = 1; i < cols; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        // 0th col
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = grid[i][j] +
                        Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[rows - 1][cols - 1];
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int digitCount = (int) Math.floor(Math.log10(nums[i]));
            if(digitCount % 2 == 0) { count++; }
        }
        return count;
    }

}
