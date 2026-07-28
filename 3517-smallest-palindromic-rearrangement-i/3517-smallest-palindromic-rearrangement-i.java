class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] firstHalf = s.substring(0, n/2).toCharArray();
        Arrays.sort(firstHalf);    
        char[] ans = new char[n];
        for(int i=0; i<firstHalf.length; i++){
            ans[i] = firstHalf[i];    //front half
            ans[n-1-i] = firstHalf[i];   //back half
        }
        if(n % 2 != 0){   //odd length --> then fix middle element
            ans[n/2] = s.charAt(n/2);
        }
        return new String(ans);   //converting char array to string
    }
}