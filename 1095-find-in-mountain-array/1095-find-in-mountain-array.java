/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    //1. Find peak element index
    public int peakIndex(MountainArray mountainArr, int n){
        int low = 0;
        int high = n-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)) low = mid+1;
            else high = mid;
        }
        return low;
    }
    //2. BS on left Increasing arr
    public int lowerBound(MountainArray mountainArr, int target, int peakI){
        int low = 0;
        int high = peakI;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mountainArr.get(mid) == target) return mid;
            else if(mountainArr.get(mid) > target) high = mid-1;
            else low = mid +1;
        }
        return -1;
    }
    //3. BS on right decreasing arr
    public int upperBound(MountainArray mountainArr, int n, int target, int peakI){
        int low = peakI + 1;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mountainArr.get(mid) == target) return mid;
            else if(mountainArr.get(mid) > target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peakI = peakIndex(mountainArr, n);
        int index = lowerBound(mountainArr, target, peakI);
        if(index != -1) return index;
        return upperBound(mountainArr, n, target, peakI);
    }
}