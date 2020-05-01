package com.company;

public class BitwiseANDOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {
        int answer = 0;
        for (int i = 30; i >= 0 ; i--) {
            if ((m & (1 << i)) != (n & (1 << i))) {
                break;
            }
            else {
                answer |= (m & (1 << i));
            }
        }
        return answer;
    }


}
