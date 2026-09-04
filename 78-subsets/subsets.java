class Solution {
    void solve(int i, int[] nums, List<List<Integer>> ans, List<Integer> temp,int n) {
        if(i == n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        solve(i+1, nums, ans,  temp, n);

        temp.add(nums[i]);
        solve(i+1, nums, ans, temp, n);
        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, ans, temp,nums.length);

        return ans;
    }
}