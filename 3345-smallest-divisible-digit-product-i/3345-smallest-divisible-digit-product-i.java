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
        for(int i=n; i<=100; i++){
            if(product(i) % t == 0) return i;
        }
        return 0;
    }
}