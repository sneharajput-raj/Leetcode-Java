class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;   //convert letter to its zero based index(0-25)
        }
        Arrays.sort(freq);
        int pushes = 0;
        for(int i=0; i<26; i++){
            int count = freq[25 - i];   //pick the i-th largest frequency
            if(count == 0) break;
            int pressCost = (i/8)+1;
            pushes = pushes + count*pressCost;
        }
        return pushes;
    }
}