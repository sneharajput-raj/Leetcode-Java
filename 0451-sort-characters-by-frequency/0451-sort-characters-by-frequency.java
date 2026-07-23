class Solution {
    public String frequencySort(String s) {
        char[] chArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : chArr){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        String ans = "";
        while(map.isEmpty() == false){
            int max = -1;
            char maxKey = ' ';
            for(char key : map.keySet()){
                if(map.get(key) > max){
                    max = map.get(key);
                    maxKey = key;
                }
            }
            for(int i=0; i<max; i++){   //max --> because bo char max times hai toh utne times bo key.. ans string me bi chle jayegi
                ans = ans + maxKey;
            }
            map.remove(maxKey);
        }
        return ans;
    }
}