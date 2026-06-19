let dp: number[];

function solve(i: number, nums: number[]): number {

    if(i >= nums.length-1) return 0;

    if(dp[i] != -1) return dp[i];

    let mini = Number.MAX_VALUE;

    for(let j = 1; j <= nums[i]; j++){
        mini = Math.min(mini, 1 + solve(i+j, nums));
    }

    return dp[i] = mini;
}
function jump(nums: number[]): number {
    dp = new Array(nums.length).fill(-1);
    return solve(0,nums);
};