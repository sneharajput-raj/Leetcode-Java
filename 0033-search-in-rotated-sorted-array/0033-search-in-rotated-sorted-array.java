class Solution {
    public int search(int[] nums, int target) {
        //tell me the index from where array is rotated
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]){          //check left half is sorted 
                if(target >= nums[low] && target < nums[mid]) high = mid - 1;   //search in left
                else low = mid + 1;      //search in right
            }
            else{            // right half must be sorted
                if(target > nums[mid] && target <= nums[high]) low = mid + 1;   //search right
                else high = mid - 1;          //search left
            }
        }
        return -1;
    }
}