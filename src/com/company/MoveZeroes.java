package com.company;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }

    /*
        0 1 0 3 12

     */
    public static void moveZeroes(int[] nums) {
        int size = nums.length;
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            else {
                int newIndex = i - zeroCount;
                nums[newIndex] = nums[i];
            }
        }
        int index = size - zeroCount;
        for (int i = index; i < size; i++) {
            nums[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
