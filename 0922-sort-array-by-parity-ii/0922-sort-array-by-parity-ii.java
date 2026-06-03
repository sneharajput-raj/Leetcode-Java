class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int evenI = 0;
        int oddI = 1;
        for(int num : nums){
            if(num % 2 == 0){
                ans[evenI] = num;
                evenI = evenI + 2;
            }
            else{
                ans[oddI] = num;
                oddI += 2;
            }
        }
        return ans;
    }
}