class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int low = j + 1;
                int high = nums.length - 1;

                while (low < high) {
                    long sum = (long) nums[i] + nums[j] + nums[low] + nums[high];

                    if (sum == target) {
                        List<Integer> l = new ArrayList<>();

                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[low]);
                        l.add(nums[high]);

                        ans.add(l);

                        low++;
                        high--;

                        while (low < high && nums[low] == nums[low - 1]) {
                            low++;
                        }

                        while (low < high && nums[high] == nums[high + 1]) {
                            high--;
                        }

                    } else if (sum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return ans;
    }
}