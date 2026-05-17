class Solution {
    public int findLucky(int[] arr) {
        //lucky int--> if its key and value are equal -->if there are more than 1 lucky integer return the largest 
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) +1);
        }
        int max = -1;
        for(int key : map.keySet()){
            if(map.get(key) == key){
                max = Math.max(max, key);
            } 
        }
        return max;
    }
}