class Solution {
    public int minimumPushes(String word) {
       int n = word.length();
       int pushes = 0;
       for(int i=0; i<n; i++){
        pushes = pushes + (i/8) +1;
       }
       return pushes;
    }
}
//first 8 letters --> 1 push (can placed as the 1st letter)
//next 8(9-16) letters --> 2 push
//next8(17-24) letters --> 3 push
//remaing letters(25, 26)--> 4 push