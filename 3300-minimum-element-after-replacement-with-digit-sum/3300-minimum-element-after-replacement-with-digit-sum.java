class Solution {
    public int digitSum(int x){
        int dc = 0;
        while(x > 0){
            dc = dc + x % 10;
            x = x/10;
        }
        return dc;
    }
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        for(int i=0; i<n; i++){
            copy[i] = digitSum(nums[i]);
        }
        int min = nums[0];
        for(int i=0; i<n; i++){
            min = Math.min(min, copy[i]);
        }
        return min;
    }
}