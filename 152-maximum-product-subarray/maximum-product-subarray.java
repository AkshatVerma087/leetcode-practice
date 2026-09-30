class Solution {
    public int maxProduct(int[] nums) {
        int max1 = nums[0];
        int max2 = nums[0];

        int product = 1;

        for(int i = 0; i < nums.length; i++) {
            product = product * nums[i];

            max1 = Math.max(max1, product);
            // max1 = Math.max(max1, nums[i]);
            if(nums[i] == 0){
                product = 1;

            }
        }

        product = 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            product = product * nums[i];
            
            max2 = Math.max(max2, product);
            // max2 = Math.max(max2, nums[i]);
            if(nums[i] == 0){
                product = 1;

            }
        }

        return Math.max(max1, max2);
    }
}