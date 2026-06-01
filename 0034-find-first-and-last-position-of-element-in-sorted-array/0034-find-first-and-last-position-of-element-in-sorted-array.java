class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int startI = -1;
        int endI = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(nums[mid] == target){
                startI = mid;
                high = mid -1;
            }
            else if(target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        low = 0;
        high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                endI = mid;
                low = mid + 1;
            }
            else if(target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        ans[0] = startI;
        ans[1] = endI;
        return ans;
    }
}