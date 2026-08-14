class Solution {
    void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(nums[left] < nums[right]) {
                temp.add(nums[left]);
                left++;
            }else {
                temp.add(nums[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while(right <= high) {
            temp.add(nums[right]);
            right++;
        }


        for(int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    int solve(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int cnt = 0;


        System.out.println(low + " " + mid);

        while(left <= mid) {
            while(right <= high && nums[left] > nums[right] * 2L) {
                right++;
            }

            cnt += right - (mid+1); 

            left++;
        }

        return cnt;
    }
    int mergeSort(int[] nums, int low, int high) {
        int cnt = 0;

        int mid = low + (high - low) / 2;
        if(low >= high) return 0;

        cnt += mergeSort(nums, low, mid);
        cnt += mergeSort(nums, mid+1, high);
        cnt += solve(nums, low, mid, high);
        merge(nums, low, mid, high);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        int ans = mergeSort(nums, 0, nums.length-1);
        for(int num : nums)  System.out.print(num + " ");
       
        return ans;
    }
}