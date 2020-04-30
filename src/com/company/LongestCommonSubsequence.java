package com.company;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String A, String B) {
        int aLen = A.length();
        int bLen = B.length();
        int[][] result = new int[bLen+1][aLen+1];
        for (int i = 0; i <= A.length(); i++) {
            result[0][i] = 0;
        }

        for (int i = 0; i < B.length(); i++) {
            result[i][0] = 0;
        }

        for (int i = 1; i <= B.length(); i++) {
            for (int j = 1; j <= A.length(); j++) {
                int compare = Character.compare(B.charAt(i-1),
                        A.charAt(j-1));
                if (compare == 0) {
                    result[i][j] = 1 + result[i-1][j-1];
                }
                else {
                    result[i][j] = Math.max(result[i-1][j],
                            result[i][j-1]);
                }
            }
        }
        return result[bLen][aLen];
    }
}
