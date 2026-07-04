class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxTotalSum = Integer.MIN_VALUE;
        int maxLeftValue = Integer.MIN_VALUE;
        for(int i=k; i<n; i++){
            maxLeftValue = Math.max(maxLeftValue , nums[i-k]);
            maxTotalSum = Math.max(maxTotalSum , maxLeftValue + nums[i]);
        }
        return maxTotalSum;
    }
}