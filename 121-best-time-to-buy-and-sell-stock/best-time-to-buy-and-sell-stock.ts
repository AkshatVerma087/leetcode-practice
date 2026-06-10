function maxProfit(prices: number[]): number {
    let maxi: number = Number.MIN_SAFE_INTEGER;

    let ans: number = 0;

    for(let i = prices.length - 1; i >= 0; i--){
        ans = Math.max(ans, maxi - prices[i]);
        maxi = Math.max(maxi, prices[i]);
    }
    return ans;
};