class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ans1 = Integer.MIN_VALUE;
        int ans2 = Integer.MIN_VALUE;
    
        int curr1 = 0;
        int curr2 = 0;

        for(int num : nums) {
            if(num == ans1) {
                curr1++;
            } else if(num == ans2) {
                curr2++;
            }else if(curr1 == 0 && ans2 != num) {
                curr1++;
                ans1 = num;
            }else if(curr2 == 0 && ans1 != num) {
                curr2++;
                ans2 = num;
            }else {
                curr1--;
                curr2--;
            }
        }

        
        List<Integer> ans = new ArrayList<>();

        int mini = nums.length / 3;

        curr1 = 0;
        curr2 = 0;

        for(int num : nums) {
            if(num == ans1) curr1++;
            if(num == ans2) curr2++;
        } 

        if(curr1 > mini) ans.add(ans1);
        if(curr2 > mini) ans.add(ans2);
        
        System.out.println(ans1 + " " + ans2);

        return ans;
    }
}