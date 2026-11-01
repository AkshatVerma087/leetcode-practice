class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int cnt = 0;

        for(int num : nums) {
            if(num == 1) cnt++;
            else{
                ans = Math.max(ans, cnt);
                cnt = 0;
                }
        }

        ans = Math.max(ans, cnt);

        return ans;
        
    }
}