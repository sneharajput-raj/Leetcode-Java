class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        //zero = 2*5 
        while(n >= 5){
            count = count + n/5;   //count how many numbers upto n are divisible by 5 
            n = n/5;
        }
        return count;
    }
}