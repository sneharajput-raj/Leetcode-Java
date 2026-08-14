class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        for(int right=0; right<n; right++){  //extend
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);   
            while(map.get(ch) > 2){   //shrink
                char leftChar = s.charAt(left);
                map.put(leftChar , map.get(leftChar) - 1);   //map update
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);   //update
        }
        return maxLen;
    }
}