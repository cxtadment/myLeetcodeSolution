public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int[] profits = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            profits[i] = Math.max(profits[i - 1], profits[i - 1] + prices[i] - prices[i - 1]);
        }
        return profits[prices.length - 1];
    }
}