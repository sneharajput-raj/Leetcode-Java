class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();
        for(int ele : nums1) li.add(ele);
        for(int ele : nums2) li.add(ele);
        Collections.sort(li);
        int n = li.size();
        if(n % 2 == 0){
            return (li.get(n/2) + li.get(n/2 - 1)) / 2.0;    //even no. of elements hai toh beech ke 2 numbers ka median
        }
        else return li.get(n/2);       //odd no. of elements hue toh beech ka element hi median
    }
}