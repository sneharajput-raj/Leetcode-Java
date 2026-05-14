class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                if(key % 2 == 0) return key;
            }
        }
        return -1;
    }
}