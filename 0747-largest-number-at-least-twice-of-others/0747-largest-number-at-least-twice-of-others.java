class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int index = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > max){
                max = Math.max(max, nums[i]);
                index = i;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] != max){
                if(max < 2*nums[i])  return -1;
            }
        }
        return index;
    }
}