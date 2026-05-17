class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE; //nums[0] (assume)
        for(int i=0; i<n; i++){
            max = Math.max(max , nums[i]);
        }
        for(int i=0; i<n; i++){
            if(max == nums[i]) return i;
        }
        return -1;
    }
}