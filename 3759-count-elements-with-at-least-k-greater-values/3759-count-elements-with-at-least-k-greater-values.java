class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if(n < k) return 0;
        if(k == 0) return n;
        Arrays.sort(nums);
        int count = 0;
        int targetIndex = n-k;
        for(int i=0; i<n; i++){
            if(nums[targetIndex] > nums[i]) count++;
        }
        return count;
    }
}