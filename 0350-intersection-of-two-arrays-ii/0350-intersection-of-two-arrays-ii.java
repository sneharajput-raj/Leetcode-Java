class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;   //nums1
        int j=0;   //nums2
        int k=0;   //result
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i]> nums2[j]) j++;
            else {                    //nums1[i] == nums2[i]   --> match found
                nums1[k] = nums1[i];   //putting matching value in result position
                i++;
                j++;
                k++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);   //return new array of k size(0 to k) in nums1 
    }
}