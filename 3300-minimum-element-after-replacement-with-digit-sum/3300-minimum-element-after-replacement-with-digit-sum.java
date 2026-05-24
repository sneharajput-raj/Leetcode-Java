class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            int x = nums[i];
            int sum = 0;
            while(x > 0){
                sum = sum + x % 10;
                x = x/10;
            }
            min = Math.min(min , sum);
        }
        return min;
    }
}