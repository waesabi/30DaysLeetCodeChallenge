package com.company.Day7;

public class CountingElements {

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,0};
        System.out.println(countElements(arr));
    }

    // Accepted 
    public static int countElements(int[] arr) {
        int size = arr.length;
        if (size < 1) { return 0; }
        int maxValue = arr[0];
        for (int i = 1; i < size; i++) {
            maxValue = Math.max(arr[i],maxValue);
        }
        int[] temp = new int[maxValue + 1];
        for (int i = 0; i < size; i++) {
            temp[arr[i]]++;
        }

        for (int value: temp) {
            System.out.print(value + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != 0 && temp[i-1] != 0) {
                count += temp[i-1];
            }
        }
        return count;
    }

}
