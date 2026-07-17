class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(char key : map.keySet()){
            int freq = map.get(key);
            if(freq % 2 != 0) maxOdd = Math.max(maxOdd, freq);
            else minEven = Math.min(minEven, freq);
        }
        return maxOdd - minEven;
    }
}