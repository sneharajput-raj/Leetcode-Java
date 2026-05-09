class Solution {
    public int countParity(int i, int x, int[] nums, int n){
        int count = 0;
        if(x % 2 == 0){
            for(int j=i+1; j<n; j++){
                if(nums[j] % 2 != 0) count++;
            }
        }
        else{
            for(int j=i+1; j<n; j++){
                if(nums[j] % 2 == 0) count++;
            }
        }
        return count;
    }
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = countParity(i, nums[i], nums, n);
        }
        return ans;
    }
}
//T.C. = O(N2)
//S.c. = O(N)