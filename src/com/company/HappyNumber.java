package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    // Accepted
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        boolean isPossible = false;
        while (n != 0) {
            int k = n;
            int newNumber = 0;
            while (k != 0) {
                System.out.println("k: " + k);
                int x = k % 10 ;
                k = k / 10;
                newNumber += (x * x);
            }
            if (newNumber == 1) {
                isPossible = true;
                break;
            }
            System.out.println(n);
            if (set.contains(newNumber)) {
                isPossible = false;
                break;
            }
            else {
                set.add(newNumber);
            }
            n = newNumber;
        }
        return isPossible;
    }
}
