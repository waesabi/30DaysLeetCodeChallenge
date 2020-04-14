package com.company.Day13;

import java.util.HashMap;

public class ContiguousArray {

    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(findMaxLength(arr));
    }

    public static int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            }
            else {
                map.put(sum, i);
            }
            System.out.println(map);
        }
        return max;
    }
}
