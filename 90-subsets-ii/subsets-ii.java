class Solution {
    void solve(int idx, List<Integer> temp, List<List<Integer>> ans, int[] nums, int n) {
        ans.add(new ArrayList<>(temp));

        for(int i = idx; i < n; i++) {
            if(idx < i && nums[i] == nums[i-1]) continue;

            temp.add(nums[i]);
            solve(i+1, temp, ans, nums,  n);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(0, temp, ans, nums, nums.length);

        return ans;
    }
}