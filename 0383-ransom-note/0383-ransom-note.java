class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch , map.getOrDefault(ch, 0)+1);
        }
        for(char c : ransomNote.toCharArray()){
            int count = map.getOrDefault(c, 0);
            if(count == 0) return false;
            else map.put(c, count-1);    //phle se present h toh value update ho jayegi 
        }
        return true;
    }
}