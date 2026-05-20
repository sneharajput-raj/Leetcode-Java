class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        // int low = 0;
        // int high = n-1;
        ArrayList<Integer> li = new ArrayList<>();
        // while(low <= high){
        //     int mid = (low + high)/2;
        //     if(nums[mid] == target)
        // }
        for(int i=0; i<n; i++){
            if(nums[i] == target) li.add(i);
        }
        return li;
    }
}