class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1; 
        while(low < high){    //low or high ek kum tk hi chlenge... equal pr nhi
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[high])  low = mid + 1;  //agr nums[mid] bada hai nums[high] se mtlb minimum Right side milega
            else high = mid;   //or agr nums[mid] <= nums[high] hai toh minimum ya toh mid hoga ya Left side me milega
        }
        return nums[low];    //at last low jaha hoga wahi minimum hoga
    }
}