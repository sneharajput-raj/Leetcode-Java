class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n % k != 0) return false;
        int totalGrp = n/k;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele , map.getOrDefault(ele, 0) +1);

            if(map.get(ele) > totalGrp) return false;
        }
        return true;
    }
}