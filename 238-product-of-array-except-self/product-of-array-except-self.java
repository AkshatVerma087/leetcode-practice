class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);

        for(int i = 1; i < n; i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int product = 1;
        for(int i = n - 1; i >= 0; i--){
            ans[i] *= product;
            product *= nums[i];
        }

        return ans;
        
    }
}