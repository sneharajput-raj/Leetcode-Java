class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            // int mid = low + (high - low)/2;
            if(arr[low] < arr[high]) low++;
            else high--;
        }
        return low;
    }
}