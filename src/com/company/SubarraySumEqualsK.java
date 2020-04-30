package com.company;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        int k = 0;
        System.out.println(subarraySum(arr,k));
    }

    // Accepted
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int size = nums.length;
        if (size == 0) { return 0; }
        // Prefix Sum
        for (int i = 1; i < size; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        // check for each size of subArray
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int diff = nums[i] - k;
            if (nums[i] == k) {
                count++;
            }
            if (map.containsKey(diff)) {
                count += map.get(diff);
            }
            map.put(nums[i] ,
                    map.getOrDefault(nums[i],0) + 1);
        }
        return count;
    }
}
