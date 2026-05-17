class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int xor = 0;
        for(int i=0; i<ch1.length; i++){
            xor = xor ^ (int)ch1[i];
        }
        for(int i=0; i<ch2.length; i++){
            xor = xor ^ (int)ch2[i];
        }
        return (char)xor;
    }
}