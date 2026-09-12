class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int i=0;
        int j = (n+1)/2;
        int removedPairs = 0;

        while(i < n/2 && j < n){
            if(nums.get(i) < nums.get(j)){
                removedPairs++;
                i++;
            }
            j++;
        }
        return n - (2*removedPairs);
    }
}