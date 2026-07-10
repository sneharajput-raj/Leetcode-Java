class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int right=0; right<n; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right] , 0)+1);   //expand
            while(map.size() > 2){   //shrink
                map.put(fruits[left], map.get(fruits[left])-1);
                if(map.get(fruits[left]) == 0) map.remove(fruits[left]);
                left++;
            }
            max = Math.max(max, right-left+1);   //update
        }
        return max;
    }
}