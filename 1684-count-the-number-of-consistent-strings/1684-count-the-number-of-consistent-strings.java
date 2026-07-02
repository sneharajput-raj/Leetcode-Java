class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()) set.add(ch);
        int count = 0;
        for(String s : words){  //loop through each word in array
            boolean check = true;
            for(char ch : s.toCharArray()){  //check every character of the current word
                if(!set.contains(ch)){
                    check = false;
                    break;
                }
            }
            if(check == true) count++;
        }
        return count;
    }
}