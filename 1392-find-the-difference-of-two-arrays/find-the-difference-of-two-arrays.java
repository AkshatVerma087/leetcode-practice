class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();

        for(int num : nums1) {
            st1.add(num);
        }

        for(int num : nums2) {
            st2.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int num : st1) {
            if(!st2.contains(num)){
                temp.add(num);
            }
        }

        ans.add(temp);
        temp = new ArrayList<>();

        for(int num : st2) {
            if(!st1.contains(num)){
                temp.add(num);
            }
        }

        ans.add(temp);

        return ans;
    }
}