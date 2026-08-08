class Solution {
    public int countDigitOne(int n) {
        long count = 0;
        for(long i=1; i<=n; i=i*10){   //(i.. 1,10,100)
            long divider = i*10;
            count = count + (n/divider)*i;
            long rem = n % divider;
            if(rem >= 2*i-1){
                count = count + i;
            }
            else if(rem >= i){
                count = count + rem-i+1;
            }
        }
        return (int)count;
    }
}