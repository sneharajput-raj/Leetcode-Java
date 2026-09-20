class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        
        for(int i=0; i<s.length(); i++){
            int stringIndex = i+1;      //1-based indexing
            int reverseAlp = 26 - (s.charAt(i) - 'a');
            sum = sum + reverseAlp * stringIndex;
        }
        return sum;
    }
}