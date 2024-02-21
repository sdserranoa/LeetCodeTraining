package org.example.BestTimetoBuyandSellStock121;

public class Solution {
    public int maxProfit(int[] prices) {

        int maxPrice = 0;
        int maxIndex = 0;

        int minPrice = Integer.MAX_VALUE;
        int minIndex = 0;

        int maxProfit = 0;

        for (int i = 0; i < prices.length ; i++) {
            //System.out.println(prices[i]+ " " + minPrice+ " " + maxPrice);
            if (prices[i] < minPrice ) {
                maxPrice = 0;
                for (int j = i+1; j < prices.length; j++) {
                    if (prices[j] > maxPrice) {
                        if (prices[j]-prices[i]>maxProfit) {
                            maxProfit = prices[j]-prices[i];
                            minPrice = prices[i];
                        }
                    }
                }
            }
        }

        return maxPrice-minPrice;
    }
}
