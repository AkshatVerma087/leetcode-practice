class Solution {
public:
    int n, m;

    int solve(int i, int j, vector<vector<int>>& matrix, vector<vector<int>>& dp, vector<vector<bool>>& vis){
        
        if(i < 0 || j < 0 || i > n-1 || j > m-1) return 1e9;

        if(i == n-1){
            return matrix[i][j];
        }

        if(vis[i][j] != false) return dp[i][j];

        vis[i][j] = true;

        int op1 = matrix[i][j] + solve(i+1, j-1, matrix, dp, vis);
        int op2 = matrix[i][j] + solve(i+1, j, matrix, dp, vis);
        int op3 = matrix[i][j] + solve(i+1, j+1, matrix, dp, vis);

        return dp[i][j] = min({op1, op2, op3});
    }
    int minFallingPathSum(vector<vector<int>>& matrix) {
        n = matrix.size();
        m = matrix[0].size();
        int ans = INT_MAX;

        

        for(int i = 0; i < n; i++){
            vector<vector<int>> dp(n, vector<int>(m, -1));
            vector<vector<bool>> vis(n, vector<bool>(m, false));
            ans = min(ans, solve(0, i, matrix, dp, vis));
        }

        return ans;
    }
};