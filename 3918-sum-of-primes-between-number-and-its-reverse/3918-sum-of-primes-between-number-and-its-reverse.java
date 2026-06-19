class Solution {
    public boolean isPrime(int x){
        int count = 0;
        for(int i=1; i<=x; i++){
            if(x % i == 0) count++;
        }
        if(count == 2) return true;
        return false;
    }
    public int sumOfPrimesInRange(int n) {
        int r = 0;
        int dummy = n;
        while(n != 0){
            r = r*10 + n%10;
            n = n/10;        //n == 0
        }
        int max = Math.max(dummy, r);
        int min = Math.min(dummy, r);
        int sum = 0;
        for(int i=min; i<=max; i++){
            if(isPrime(i))  sum += i;
        }
        return sum;
    }
}