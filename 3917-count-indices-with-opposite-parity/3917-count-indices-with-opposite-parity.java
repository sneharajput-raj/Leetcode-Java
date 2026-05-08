class Solution {
    public int countParity(int x , int[] nums, int i , int n){
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
        int[] res = new int[n];
        for(int i=0; i<n; i++){          
            res[i] = countParity(nums[i] , nums, i ,n);
        }
        return res;
    }
}
//T.C. = O(n2)
//S.C. = O(n)