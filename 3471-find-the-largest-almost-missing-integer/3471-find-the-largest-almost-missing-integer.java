class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> subCount = new HashMap<>();
        for(int i=0; i<= nums.length - k; i++){
            Set<Integer> uniqueSub = new HashSet<>();
            for(int j=i; j < i+k; j++){
                uniqueSub.add(nums[j]);
            }
            for(int num : uniqueSub){
                subCount.put(num, subCount.getOrDefault(num , 0)+1);
            }
        }
        int ans = -1;
        for(int ele : subCount.keySet()){
            if(subCount.get(ele) == 1){
                ans = Math.max(ans, ele);
            }
        }
        return ans;
    }
}