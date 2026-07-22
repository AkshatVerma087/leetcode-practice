class Solution {
    public int maxProfit(int[] prices) {
        int maxi = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;

        for(int i = prices.length - 1; i >= 0; i--){
            maxi = Math.max(maxi, prices[i]);
            ans = Math.max(ans, maxi - prices[i]);
        }

        return ans;
    }
}