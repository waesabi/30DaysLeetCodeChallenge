package com.company;

public class PerformStringShifts {

    public static void main(String[] args) {
        // int[][] shift = {{1,1},{1,1},{0,2},{0,3}};
        int[][] shift = {{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}};
        System.out.println(stringShift("wpdhhcj",shift));;
    }

    // Accepted
    public static String stringShift(String s, int[][] shift) {
        int finalShift = 0;
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] > 0) {
                finalShift += shift[i][1];
            }
            else {
                finalShift -= shift[i][1];
            }
        }
        finalShift = finalShift % s.length();
        if (finalShift == 0) { return s; }
        StringBuilder builder = new StringBuilder("");
        int index = Math.abs(finalShift);
        if (finalShift >= 0) {
            index = s.length() - finalShift;
        }
        String left = s.substring(0,index);
        String right = s.substring(index);
        builder.append(right);
        builder.append(left);
        return builder.toString().trim();
    }
}
