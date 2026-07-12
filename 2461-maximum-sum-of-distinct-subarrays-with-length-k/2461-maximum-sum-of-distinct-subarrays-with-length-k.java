class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long currSum = 0;
        long maxSum =0;
        int left = 0;
        Set<Integer> set = new HashSet<>();
        for(int right=0; right<n; right++){
            while(set.contains(nums[right])){   //shrink
                set.remove(nums[left]);
                currSum = currSum - nums[left];
                left++;
            }
            set.add(nums[right]);   //expand
            currSum += nums[right];
            if(right-left+1 == k){
                maxSum = Math.max(maxSum, currSum);
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}