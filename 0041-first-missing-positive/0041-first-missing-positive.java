class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        for(int i=1; i<=n+1; i++){  //positive integer -->means 0 nhi lena h
            if(set.contains(i) == false) return i;
        }
        return -1;
    }
}