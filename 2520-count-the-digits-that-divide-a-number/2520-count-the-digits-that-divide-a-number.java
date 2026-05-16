class Solution {
    public int countDigits(int num) {
        int count = 0;
        int dummy = num;
        while(num > 0){
            int rem = num % 10;
            if(dummy % rem == 0) count++;
            num = num/10;
        }
        return count;
    }
}