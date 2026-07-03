class Solution {
    public double solve(double x , long n){
        if(n == 0) return 1;     //base case
        if(n < 0){     //negative power
            return solve(1/x , -n);
        }
        if(n % 2 == 0){      //even
            return solve(x*x , n/2);
        }
        else{      //odd
            return x * solve(x*x , (n-1)/2);
        }
    }
    public double myPow(double x, int n) {
        return solve(x, (long)n);     //long --> if n = -31
    }
}