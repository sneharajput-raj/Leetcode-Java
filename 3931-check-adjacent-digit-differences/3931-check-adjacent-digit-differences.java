class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length-1; i++){
            int a = ch[i] - '0';       //character se number convert --> '1' - '0' = 1
            int b = ch[i+1] - '0';
            if(Math.abs(a-b) > 2) return false;
        }
        return true;
    }
}