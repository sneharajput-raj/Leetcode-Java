/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid) == false) low = mid+1;         //false=good
            else high = mid-1;                                  //true=bad
        }
        return low;            //at last low jaha h wahi 1st bad version of
    }
}