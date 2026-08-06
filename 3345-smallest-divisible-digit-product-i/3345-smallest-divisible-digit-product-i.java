class Solution {
    public int product(int x){
        int prod =  1;
        while(x != 0){
            prod = prod * (x%10);
            x = x/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n; i<= n+10; i++){  //loop stops at n+10 as at least one number in any 10 consecutive integers has digit product 0
            if(product(i) % t == 0) return i;
        }
        return 0;
    }
}