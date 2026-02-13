class Solution {
    public int maxProfit(int[] prices) {
        int day_lowest = 0;
        int profit1=0;
        int profit_prev = 0;
        int lowest = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (lowest > prices[i]) {
                lowest = prices[i];
                day_lowest = i + 1;
            }
        }

        for (int i = (day_lowest); i < prices.length; i++) {
            if (prices[i] > lowest) {
                profit1 = prices[i] - lowest;
            }
            if (profit_prev < profit1) {
                profit_prev = profit1;
            }
        }
        return profit_prev;
    }

}