let dp: number[][];
function solve(i: number, prices: number[], n: number, canBuy: number): number {
    if(i == n) return 0;
    
    if(dp[i][canBuy] !== -1) return dp[i][canBuy];

    if(canBuy){
        return dp[i][canBuy] = Math.max(-prices[i] + solve(i+1, prices, n, 0), solve(i+1, prices, n, 1));
    }else{
        return dp[i][canBuy] = Math.max(prices[i] + solve(i+1, prices, n, 1), solve(i+1, prices, n, 0));
    }
}
function maxProfit(prices: number[]): number {
    let n: number = prices.length;
    dp = Array.from({ length: n }, () => Array(2).fill(-1));
    return solve(0, prices, n, 1);
};