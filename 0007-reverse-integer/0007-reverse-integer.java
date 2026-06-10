class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;   //preserves -ve sign automatically(e.g. --> -123 % 10 = -3)
            x = x/10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int)rev; 
    }
}