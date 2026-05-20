class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int low = 0;
        int high = n-1;
        int firstI = -1;
        int lastI = -1;
        while(low <= high){        //for first position of element
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                firstI = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        ans[0] = firstI;
        //update low and high at 0 and n-1
        low = 0;        
        high = n-1;
        while(low <= high){             //last position of element
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                lastI = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        ans[1] = lastI;
        return ans;
    }
}