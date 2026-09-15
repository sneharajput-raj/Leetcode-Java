class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(mid % 2 == 1) mid--;    //ensure mid is even
            if(nums[mid] == nums[mid+1]) low = mid + 2;  //if both match the single element is on right
            else high = mid;  //otherwise, single element is mid or to the left
        }
        return nums[low];
    }
}