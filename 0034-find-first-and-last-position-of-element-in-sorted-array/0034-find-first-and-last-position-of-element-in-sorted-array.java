class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int firstI = -1;
        int secondI = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;      //mid is always a mid index
            if(nums[mid] == target){
                firstI = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        low = 0;
        high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                secondI = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        ans[0] = firstI;
        ans[1] = secondI;
        return ans;
    }
}