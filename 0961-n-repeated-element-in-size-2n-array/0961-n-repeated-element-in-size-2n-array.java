class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == n) return key;
        }
        return 0;
    }
}