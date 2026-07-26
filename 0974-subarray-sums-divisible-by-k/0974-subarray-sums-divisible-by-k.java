class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int result = 0;
        for(int num : nums){
            prefixSum = prefixSum + num;
            int rem = prefixSum % k;
            if(rem < 0) {
                rem = rem + k;    //handle -ve remainder
            }
            if(map.containsKey(rem)){
                result = result + map.get(rem);
            }
            map.put(rem , map.getOrDefault(rem , 0)+1);  //update value of current key everytime
        }
        return result;
   }
}