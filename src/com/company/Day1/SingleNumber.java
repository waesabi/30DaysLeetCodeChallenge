package com.company.Day1;

public class SingleNumber {

    // Accepted
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i< nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
