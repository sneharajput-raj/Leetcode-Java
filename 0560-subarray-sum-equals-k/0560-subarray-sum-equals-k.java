class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int currentSum = 0;
        Map<Integer, Integer> map = new HashMap<>();   //prefixSum : value(occurance)
        map.put(0,1);   //base case (cS-k == 0) --> subarray starting from index 0 is counted   
        for(int i=0; i<n; i++){
            currentSum = currentSum + nums[i];
            if(map.containsKey(currentSum - k)){
                count = count + map.get(currentSum - k);
            }
            map.put(currentSum , map.getOrDefault(currentSum , 0) +1);
        }
        return count;
    }
}