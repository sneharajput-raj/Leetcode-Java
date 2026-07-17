class Solution {
    public boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2; i*i<=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public boolean completePrime(int num) {
        int temp = num;
        while(temp != 0){
            if(!isPrime(temp)) return false;
            temp /= 10;
        }
        long divisor = 10;
        while(divisor <= num){
            int suffix = num % (int)divisor;
            if(!isPrime(suffix)) return false;
            divisor *= 10;
        }
        return true;
    }
}