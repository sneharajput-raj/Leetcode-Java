class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){  //duplicates fix: jb teeno same ho toh boundries shrink kro
                low++;
                high--;
                continue;
            }
            if(nums[low] <= nums[mid]){       //check left half sorted
                if(target >= nums[low] && target < nums[mid]) high = mid -1;   //left half me hoga
                else low = mid + 1;    //nhi toh right half me
            }
            else{     //right half must be  sorted
                if(target > nums[mid] && target <= nums[high]) low = mid + 1;    //right half me hoga
                else high = mid - 1;   //left half me 
            }
        }
        return false;
    }
}