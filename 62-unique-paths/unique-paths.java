class Solution {
    int[][] dp;
    int solve(int i, int j) {
        if(i < 0 || j < 0) return 0;
        if(i == 0 && j == 0) return 1;

        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = solve(i-1, j) + solve(i, j-1);
    }
    public int uniquePaths(int m, int n) {
        if(m-1 == 0 && n-1 == 0) return 1;
        if(m-1 < 0 || n-1 < 0) return 0;
        dp = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(n-1, m-1);
    }
}