class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int curr = 0;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num != 1) {
                ans = Math.max(curr, ans);
                curr = 0;
            }else{
                curr++;
            }
        }

        ans = Math.max(curr, ans);

        return ans;
    }
}