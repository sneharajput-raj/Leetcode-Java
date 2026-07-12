class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(i > k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])) return true;  //agr set mein nhi h nums[i] , toh use add krke true return kr dega  (means bo unique h)
        }
        return false;
    }
}