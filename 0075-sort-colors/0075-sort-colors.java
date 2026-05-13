class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                copy[j] = nums[i];
                j++;
            }
        }
         for(int i=0; i<n; i++){
            if(nums[i] == 1){
                copy[j] = nums[i];
                j++;
            }
        }
         for(int i=0; i<n; i++){
            if(nums[i] == 2){
                copy[j] = nums[i];
                j++;
            }
        }
         for(int i=0; i<n; i++){
             nums[i] = copy[i];
        }
    }
}