class Solution {
    public int sumOfDigits(int x){
        int sum = 0;
        while(x > 0){
            int rem = x % 10;
            sum = sum + rem;
            x = x/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length; 
        for(int i=0; i<n; i++){
            if(sumOfDigits(nums[i]) == i) return i;
        }
        return -1;
    }
}