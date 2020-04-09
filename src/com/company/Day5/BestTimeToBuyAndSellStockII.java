package com.company.Day5;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int betterMaxProfit(int[] prices) {
        int size = prices.length;
        if (size < 2) { return 0; }
        int totalProfit = 0;
        int buyIndex = 0, sellIndex = 0, i = 0;
        while (i < size) {
            while ((i < size - 1) && prices[i] >= prices[i+1]) {
                i++;
            }
            if (i == size-1) {
                break;
            }
            buyIndex = i++;
            while ((i < size) && prices[i] >= prices[i-1]) {
                i++;
            }
            sellIndex = i - 1;
            totalProfit += (prices[sellIndex] - prices[buyIndex]);
        }
        return totalProfit;
    }

    public static int maxProfit(int[] prices) {
        if (prices.length < 2) { return 0; }
        int total = 0;
        int buyPrice = 0;
        int sellPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                if (prices[i] < prices[i+1]) {
                    buyPrice = prices[i];
                }
            }
            else if (i == prices.length - 1) {
                if (prices[i] > prices[i-1]) {
                    sellPrice = prices[i];
                    total += (sellPrice - buyPrice);
                }
            }
            else {
                if (prices[i] >= prices[i+1] &&
                        prices[i] > prices[i-1]) {
                    sellPrice = prices[i];
                    total += (sellPrice - buyPrice);
                }
                if (prices[i] <= prices[i+1] &&
                        prices[i] <= prices[i-1]) {
                    buyPrice = prices[i];
                }
            }
        }
        return total;
    }
}
