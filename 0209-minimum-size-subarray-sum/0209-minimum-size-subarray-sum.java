class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int currentsum = 0;
        int window = Integer.MAX_VALUE;
        int left = 0;
        for(int right=0; right<n; right++){
            currentsum = currentsum + nums[right];   //expand
            while(currentsum >= target){
                window = Math.min(window, right-left+1);   //update window
                currentsum = currentsum - nums[left];   //shrink
                left++;
            }
        }
        if(window == Integer.MAX_VALUE) return 0;
        return window;
    }
}