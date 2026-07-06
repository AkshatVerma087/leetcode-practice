class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        int n = nums.length;
        this.nums = new int[n];

        for(int i = 0; i < n; i++){
            this.nums[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum += nums[i];
        }

        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */