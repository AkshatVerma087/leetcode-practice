class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int count = mp.getOrDefault(0, 0);
        int i  = 0;
        while (count > 0) {
            nums[i++] = 0;
            count--;
        }

        count = mp.getOrDefault(1, 0);

        while(count > 0) {
            nums[i++] = 1;
            count--;
        }

        
        count = mp.getOrDefault(2, 0);

        while(count > 0) {
            nums[i++] = 2;
            count--;
        }

    }
}