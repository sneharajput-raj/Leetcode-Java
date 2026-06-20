class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prePro = new int[n];
        prePro[0] = 1;
        for(int i=1; i<n; i++){
            prePro[i] = nums[i-1] * prePro[i-1];
        }
        int[] suffPro = new int[n];
        suffPro[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            suffPro[i] = nums[i+1] * suffPro[i+1];
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = prePro[i] * suffPro[i];
        }
        return ans;
    }
}