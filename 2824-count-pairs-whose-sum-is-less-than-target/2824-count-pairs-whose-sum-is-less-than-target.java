class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();     //ArrayList ki length
        Collections.sort(nums);  //ArrayList ko Sort
        int low = 0;
        int high = n-1;
        int count = 0;
        while(low <= high){
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