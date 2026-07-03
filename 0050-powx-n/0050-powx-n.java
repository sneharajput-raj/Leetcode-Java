class Solution {
    public double power(double x , long n){
        if(n == 0) return 1;        //base case
        if(n < 0){                  //negative power
            return power(1/x , -n);
        }
        if(n % 2 == 0){             //even power
            return power(x*x , n/2);       
        }
        else{                       //odd power
            return x * power(x*x , (n-1)/2);
        }
    }
    public double myPow(double x, int n) {
        return power(x, (long)n);   //n is long --> if n = 31
    }
}