class Solution {
    public int minMoves(int[] nums) {
        int mini = Integer.MAX_VALUE;
        
        for(int num : nums) {
            if(num < mini) {
                mini = num;
            }
        }

        int ans = 0;

        for(int num : nums) {
            ans += num - mini;
        }

        return ans;
    } 
}