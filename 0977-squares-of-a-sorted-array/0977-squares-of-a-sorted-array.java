class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int[] ans = new int[n];
        int j = n-1;
        while(low <= high){
            int leftSq = nums[low]*nums[low];
            int rightSq = nums[high]*nums[high];
            if(leftSq > rightSq){
                ans[j] = leftSq;
                low++;
            }
            else{
                ans[j] = rightSq;
                high--;
            }
            j--;
        }
        return ans;
    }
}