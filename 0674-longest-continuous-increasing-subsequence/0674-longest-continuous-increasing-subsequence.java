class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right<n; right++){  //expand
            if(right > 0 && nums[right] <= nums[right-1]){   //continues increasing condition breaks here
                left = right;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}