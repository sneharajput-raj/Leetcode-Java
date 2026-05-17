class Solution {
    public int minLengthAfterRemovals(String s) {
        int n = s.length();
        int countA = 0;
        int countB = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'a') countA++;
            else countB++;
        }
        return Math.abs(countA - countB);
    }
}