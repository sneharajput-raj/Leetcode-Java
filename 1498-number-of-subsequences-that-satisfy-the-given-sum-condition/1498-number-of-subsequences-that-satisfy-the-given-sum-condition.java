class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int mod = 1000000007;
        Arrays.sort(nums);
        int[] pow = new int[n];   //precompute powers to 2 modulo 10^9 + 7
        pow[0] = 1;
        for(int i=1; i<n; i++){
            pow[i] = (pow[i-1] * 2) % mod;
        }
        int low = 0;
        int high = n-1;
        int count = 0;
        while(low <= high){
            if(nums[low] + nums[high] <= target){
                count = (count + pow[high - low]) % mod;
                low++;
            }
            else high--;
        }
        return count;
    }
}