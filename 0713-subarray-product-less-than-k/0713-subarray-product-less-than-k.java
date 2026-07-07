class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int product = 1;
        int count = 0;
        int left = 0;
        for(int right=0; right<n; right++){
            product = product * nums[right];  //expand
            while(product >= k){
                product = product/nums[left];   //shrink
                left++;
            }
            count = count + (right-left+1);
        }
        return count;
    }
}