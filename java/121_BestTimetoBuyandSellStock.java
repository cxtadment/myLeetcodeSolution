public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int[] profits = new int[prices.length];
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profits[i] = Math.max(profits[i - 1], prices[i] - min);
        }
        return profits[prices.length - 1];
    }
}