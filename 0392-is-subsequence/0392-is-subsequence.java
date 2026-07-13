class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(j < t.length() && i < s.length()){
           if(s.charAt(i) == t.charAt(j)){
               i++;   //i pointer tb hi aghe bdhega jb i char j me mil gya ho
            }
            j++;  //t pointer toh har br aghe badhega
        }
        return i == s.length();   //true / false
    }
}