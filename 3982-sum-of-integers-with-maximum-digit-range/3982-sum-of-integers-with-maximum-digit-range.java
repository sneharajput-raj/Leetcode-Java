class Solution {
    public int digitRange(int num){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(num != 0){
            int rem = num % 10;
            min = Math.min(min, rem);
            max = Math.max(max, rem);
        num = num/10;
        }
        return max - min;
    }
    public int maxDigitRange(int[] nums) {
        int maxDR = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            maxDR = Math.max(maxDR , digitRange(nums[i]));
        }
        for(int i=0; i<nums.length; i++){
            if(digitRange(nums[i]) == maxDR) sum = sum + nums[i];
        }
        return sum;
    }
}