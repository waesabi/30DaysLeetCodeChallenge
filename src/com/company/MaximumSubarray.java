package com.company;

public class MaximumSubarray {


    // Accepted
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sumTillNow = 0;
        for (int i = 0; i < nums.length; i++) {
            sumTillNow += nums[i];
            if (sumTillNow > maxSum) {
                maxSum = sumTillNow;
            }
            if (sumTillNow < 0) {
                sumTillNow = 0;
            }
        }
        return maxSum;
    }
}
