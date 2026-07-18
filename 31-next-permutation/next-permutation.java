class Solution {
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }


    public void nextPermutation(int[] nums) {
        int n = nums.length;
        boolean flag = false;
        int maxi = n-1;
        int idx = -1;
        for(int i = n-2; i >= 0; i--){
            if(nums[i+1] > nums[i]) {
               
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            reverse(nums, 0, n-1);
            return;
        }

        for(int i = n-1; i >= idx; i--){
            if(nums[i] > nums[idx]){
                //  System.out.print(idx);
                swap(nums, i, idx);
                break;
            }
        }

        reverse(nums, idx+1, n-1);
        
    }
}