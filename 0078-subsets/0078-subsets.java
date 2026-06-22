class Solution {
    public void set(int i, int[] nums, List<Integer> curr, List<List<Integer>> result){
        if(i == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        set(i+1, nums, curr, result);  //choice 1
        curr.remove(curr.size()-1);  //backtrack --> remove the element we just added to explore choice 2
        set(i+1, nums, curr, result);   //choice 2
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        set(0, nums, new ArrayList<>(), result);
        return result;
    }
}