class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //arraylist se 
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            li.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            li.add(nums2[i]);
        }
        Collections.sort(li);
        int n = li.size();
        if(n % 2 == 0){     //even
            return (li.get(n/2) + li.get(n/2 - 1)) / 2.0;
        }
        else{
            return li.get(n/2);
        }
    }
}