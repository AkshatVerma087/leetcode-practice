class Solution {
public:
    int maxSumSubmatrix(vector<vector<int>>& matrix, int k) {
        int n = matrix.size();
        int m = matrix[0].size();
        vector<vector<int>> prefix(n, vector<int>(m));

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                prefix[i][j] = matrix[i][j];

                if(i > 0) prefix[i][j] += prefix[i-1][j];
                if(j > 0) prefix[i][j] += prefix[i][j-1];
                if(i > 0 && j > 0) prefix[i][j] -= prefix[i-1][j-1];
            }
        }

int ans = INT_MIN;

for(int r1 = 0; r1 < n; r1++){
    for(int c1 = 0; c1 < m; c1++){
        for(int r2 = r1; r2 < n; r2++){
            for(int c2 = c1; c2 < m; c2++){

                int sum = prefix[r2][c2];

                if(r1 > 0) sum -= prefix[r1 - 1][c2];
                if(c1 > 0) sum -= prefix[r2][c1 - 1];
                if(r1 > 0 && c1 > 0) sum += prefix[r1 - 1][c1 - 1];

                if(sum <= k)
                    ans = max(ans, sum);
            }
        }
    }
}

        return ans;
    }
};