class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];     //sum of current elements
            maxsum = Math.max(maxsum, sum);   //update max
            if(sum < 0) sum=0;   //agr sum -ve hua toh waha tk ko nhi lenge kyu ki aghe sum ko decrease hi krega bo
        }
        return maxsum;
    }
}