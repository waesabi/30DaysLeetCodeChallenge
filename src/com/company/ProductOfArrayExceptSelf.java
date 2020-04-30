package com.company;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
    }
    /*
            Try using left product and right product
                 1   2   3   4
        left     1   1  1*2  1*2*3
        right 2*3*4 3*4  4   1

        so for each element , take left * right
     */

    // Accepted
    public static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size];
        int left = 1 ;
        arr[0] = left;
        for (int i = 1; i < size; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = size - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

}
