package com.company;

public class LeftmostColumnWithAtLeastAOne {
    /*


    // Accepted
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> sizeList = binaryMatrix.dimensions();
        int rows = sizeList.get(0);
        int cols = sizeList.get(1);
        int i = 0, j = cols - 1;
        int minIndex = -1;
        while(i < rows && j >= 0) {
            if(binaryMatrix.get(i,j) == 0) {
                i++;
            }
            else {
                minIndex = j;
                j = j - 1;
            }
        }

        return minIndex;
    }
     */
}
