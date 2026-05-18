class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        Collections.sort(nums);
        int count = 0;
        int low = 0;
        int high = n-1;
        while(low < high){
            if(nums.get(low) + nums.get(high) < target){
                count = count + (high - low);
                low++;
            }
            else{
                 high--;
            }
        }
       
        return count;
    }
}
//T.C. = O(n logn)