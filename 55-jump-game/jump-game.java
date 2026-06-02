class Solution {
    public boolean solve(int i, int[] nums, int n){
        if(i == n) return true;
        if(i > n) return false;

        for(int j = 1; j <= nums[i]; j++){
            if(solve(i+j, nums, n)) return true;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i > farthest) {
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]);
        }

        return true;
    }
}