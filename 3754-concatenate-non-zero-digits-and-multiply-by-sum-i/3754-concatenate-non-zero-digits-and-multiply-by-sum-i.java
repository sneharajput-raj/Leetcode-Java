class Solution {
    public long sumAndMultiply(int n) {
        int rev = 0;
        int sum = 0;
        while(n != 0){
            if(n % 10 != 0){
                rev = rev*10  + n%10;
            }
            sum = sum + n%10;
            n = n/10;
        }
        int rev1 = 0;
        while(rev != 0){
            rev1 = rev1*10 + rev%10;
            rev = rev/10;
        }
        return (long)rev1*sum;
    }
}