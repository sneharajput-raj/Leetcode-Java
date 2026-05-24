class Solution {
    public int digitCount(int x){
        int dc = 0;
        while(x > 0){
            dc++;
            x=x/10;
        }
        return dc;
    }
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(digitCount(nums[i]) % 2 == 0) count++;
        }
        return count;
    }
}