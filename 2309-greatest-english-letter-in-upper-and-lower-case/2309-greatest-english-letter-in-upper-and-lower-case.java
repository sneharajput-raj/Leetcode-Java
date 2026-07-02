class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) set.add(ch);
        for(char ch='z'; ch>='a'; ch--){
            if(set.contains(ch) && set.contains((char)(ch - 32))){
                return String.valueOf(Character.toUpperCase(ch));
            }
        }
        return "";
    }
}