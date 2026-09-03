class Solution {
    int total(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = total(cost);
        int totalGas = total(gas);

        if(totalCost > totalGas) return -1;
        int totalDiff = 0;
        int ans = 0;
        for(int i = 0; i < gas.length; i++) {
            totalDiff += gas[i] - cost[i];
            if(totalDiff < 0) {
                ans = i+1;
                totalDiff = 0;
            } 
        }

        return ans;
    }
}