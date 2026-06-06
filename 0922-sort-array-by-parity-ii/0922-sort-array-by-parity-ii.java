class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int evenI = 0;
        int oddI = 1;
        for(int ele : nums){
            if(ele % 2 == 0){
                ans[evenI] = ele;
                evenI += 2;
            }
            else{
                ans[oddI] = ele;
                oddI += 2; 
            }
        }
        return ans;
    }
}