class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int j = 0;
        for(int i=0; i<m; i++){
            arr[j] = nums1[i];
            j++;
        }
        for(int i=0; i<n; i++){
            arr[j] = nums2[i];
            j++;
        }
        Arrays.sort(arr);
        int x = arr.length;
        if(x % 2 != 0){   //odd
            return arr[x/2];
        }
        else return (arr[x/2] + arr[(x/2) - 1]) / 2.0;
    }
}