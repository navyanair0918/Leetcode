public class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++) {
            
            // update minimum price
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // calculate profit
            else {
                int profit = prices[i] - minPrice;
                
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
}