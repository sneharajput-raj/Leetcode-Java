class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[n-1];
        for(int i=min; i>=1; i--){  //i is value/element 
            if(min % i == 0 && max % i ==0) return i;
        }
        return -1;
    }
}