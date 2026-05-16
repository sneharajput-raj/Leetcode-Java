class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int dummy = x;
        while(x > 0){
            int rem = x % 10;
            sum = sum + rem;
            x = x/10;
        }
        if(dummy % sum == 0) return sum;
        return -1;
    }
}