class Solution {
    public int digitSum(int x){
        int sum = 0;
        while(x > 0){
            sum = sum + x % 10;
            x = x/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int currentSum = digitSum(nums[i]);
            if(currentSum < min){
                min = currentSum;
            }
        }
        return min;
    }
}