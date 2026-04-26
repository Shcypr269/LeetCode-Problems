	class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int low = prices[0];
        int high = prices[0];
        int profit = 0;
        int n = prices.length;
 
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            low = prices[i];

            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            high = prices[i];
 
            profit += high - low;
        }

        return profit;
    }
}