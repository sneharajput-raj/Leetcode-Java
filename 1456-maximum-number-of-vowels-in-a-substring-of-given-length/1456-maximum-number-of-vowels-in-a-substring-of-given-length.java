class Solution {
    private boolean isVowel(char ch){
        return ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        for(int i=0; i<k; i++){    //precompute
           if(isVowel(s.charAt(i))) count++;
        }
        int maxVowels = count;
        for(int i=k; i<n; i++){
            if(isVowel(s.charAt(i))) count++;   //extand
            if(isVowel(s.charAt(i-k))) count--;   //shrink
            maxVowels = Math.max(maxVowels, count);  //update
        }
        return maxVowels;

        
    }
}