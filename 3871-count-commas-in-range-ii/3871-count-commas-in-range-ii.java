class Solution {
    public long countCommas(long n) {
        //check for each number greater than or equal to each comma threshold(10^3, 10^6, 10^9, 10^12,...)
        long ans = 0;
        long threshold = 1000;  //start at 1,000 (10^3)

        while(n >= threshold){
            ans = ans + (n - threshold+1);
            if(threshold > Long.MAX_VALUE / 1000) {
                break;
            }
            threshold = threshold*1000;
        }
        return ans;
    }
}