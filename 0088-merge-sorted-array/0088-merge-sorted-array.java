class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        //peeche se compare krte hue bade element ko K pr dalo
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){  //num2 mein abhi bhi element bache hue h toh unhe nums1 me daldo  or agr nums1 me bache toh bo already 1 me h toh dalne ki need nhi h
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}