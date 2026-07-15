class Solution {
    public boolean isPalindrome(int x) {
        //using recursion
        int rev = 0;
        return reverse(x, rev, x);
    }
    public boolean reverse(int x, int rev, int dummy){
        if(x < 0) return false;
        if(x == 0) return rev==dummy;
        return reverse(x/10, rev*10 + x%10, dummy);
    }
}