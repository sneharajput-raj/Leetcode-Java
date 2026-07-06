class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int currentsum = 0;
        int window = Integer.MAX_VALUE;
        for(int right=0; right<n; right++){
            currentsum = currentsum + nums[right];   //expand
            while(currentsum >= target){   //shrink
                //update the window
                window = Math.min(window, right-left+1);
                currentsum = currentsum - nums[left];
                left++;
            }
        }
        if(window == Integer.MAX_VALUE) return 0;  //if there no min subarray of target
        return window;
    }
}