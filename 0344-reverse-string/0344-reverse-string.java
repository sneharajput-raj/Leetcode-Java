class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int[] copy = new int[n];
        int j =0;
        for(int i = n-1; i>=0; i--){
            copy[j] = s[i];
            j++;
        }
        for(int i=0; i<n; i++){   //in-place array 
            s[i] = (char)copy[i];
        }
    }
}