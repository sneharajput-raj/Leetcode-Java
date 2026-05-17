class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        for(int i=0; i<n+1; i++){
            if(set.contains(i) == false) return i;
        }
        return -1;
    }
}