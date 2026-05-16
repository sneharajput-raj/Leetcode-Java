class Solution {
    public int minimumOperations(int[] nums) {
        //return unique number of elements in an array
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            if(ele != 0){
                set.add(ele);
            }
        }
        return set.size();
    }
}