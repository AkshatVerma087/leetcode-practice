class Solution {
public:
    void swap(vector<int>& nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        cout<<"y";
    }
    int minimumSwaps(vector<int>& nums) {
        int i = 0; 
        int j = nums.size()-1;
        int swaps = 0;
        while( i < j){
            
            while(j > i && nums[j] == 0) j--;
            if(i < j && nums[i] == 0){
                swap(nums, i, j);
                j--;
                swaps++;
            }

            i++;
        }

        for(int num : nums) cout<<num<<" ";

        return swaps;
    }
};