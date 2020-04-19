package com.company.Day19;

public class SearchInRotatedSortedArray {

    public int search(int[] arr, int target) {
        int index = findPivot(arr);
        if (index == -1) {
            return search(arr,target,0,arr.length - 1);
        }
        else if (arr[index] == target) {
            return index;
        }
        else if (arr[0] > target) {
            return search(arr,target,index+1, arr.length - 1);
        }
        else {
            return search(arr,target,0, index - 1);
        }
    }

    public static int findPivot(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid - 1 >= 0 && arr[mid - 1] > arr[mid]) {
                return mid;
            }

            if (arr[mid] >= arr[0]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static int search(int[] nums, int target, int left,
                             int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] > target) {
            return search(nums, target, left,mid - 1);
        }
        else {
            return search(nums,target,mid + 1, right);
        }
    }

}
