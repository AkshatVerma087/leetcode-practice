class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        while(j < nums.length) {
            sum += nums[j];

            if(j - i + 1 == k){
                if(ans < sum) {
                    ans = sum;
                }

                sum -= nums[i];
                i++;
                j++;
            }else{
                j++;
            }
        }

        return (double)ans / k;
    }
}