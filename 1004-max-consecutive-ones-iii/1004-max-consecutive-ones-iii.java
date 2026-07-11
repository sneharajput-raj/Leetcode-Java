class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int zeroCount = 0;
        int right;
        for(right=0; right<n; right++){
            if(nums[right] == 0) zeroCount++;     //expand
            if(zeroCount > k){    //shrink
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
        }
        return right - left;
    }
}