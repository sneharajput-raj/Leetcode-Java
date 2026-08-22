class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum = 0;
        int prod = 1;
        while(n != 0){
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n = n/10;
        }
        int totalSum = sum + prod;
        return x % totalSum == 0;
    }
}