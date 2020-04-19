package com.company.Day19;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }

    /*
        Read below blog for clear explanation
        https://leetcode.com/problems/search-in-rotated-sorted-array/discuss/14436/Revised-Binary-Search
     */
    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int size = arr.length;
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = arr[mid];
            if (midValue == target) { return mid; }

            if (midValue >= arr[left]) {
                if (target >= arr[left] && target < midValue) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if (target > midValue && target <= arr[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
