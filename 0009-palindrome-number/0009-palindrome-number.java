class Solution {
    public boolean reverse(int x, int rev, int dummy){
        if(x < 0) return false;
        if(x == 0) return rev==dummy;
        return reverse(x/10, rev*10+x%10, dummy);
    }
    public boolean isPalindrome(int x) {
        int rev = 0;
        return reverse(x, rev, x);
    }
}