class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;
        int ans = 1;
        while(ans <= n){   //find smallest power of 2 strictly greater than n
            ans <<= 1;    //left shift multiplies ans by 2
        }
        return ans;
    }
}