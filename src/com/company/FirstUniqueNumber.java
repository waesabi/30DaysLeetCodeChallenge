package com.company;

import java.util.*;



// Accepted
public class FirstUniqueNumber {

    HashSet<Integer> allElement;
    Set<Integer> uniqueSet;


    public FirstUniqueNumber(int[] nums) {
        allElement = new HashSet<>();
        uniqueSet = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int showFirstUnique() {
        if (uniqueSet.isEmpty()) { return -1; }
        return uniqueSet.iterator().next();
    }

    public void add(int value) {
        if (allElement.add(value)) {
            uniqueSet.add(value);
        }
        else {
            uniqueSet.remove(value);
        }
    }
}
