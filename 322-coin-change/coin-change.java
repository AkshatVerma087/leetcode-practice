class Solution {

    int solve(int[] coins, int i, int sum, int k, int[][] dp) {
        if(sum == k) return 0;
        if(sum > k || i >= coins.length) return 1000000;

        if(dp[i][sum] != -1) return dp[i][sum];

        int op1 = 1000000;

        if(coins[i] <= k - sum) {
            op1 = 1 + solve(coins, i, sum + coins[i], k, dp);
        }

        
        int op2 = solve(coins, i + 1, sum, k, dp);

        return dp[i][sum] = Math.min(op1, op2);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(coins, 0, 0, amount, dp);

        return ans >= 1000000 ? -1 : ans;
    }
}