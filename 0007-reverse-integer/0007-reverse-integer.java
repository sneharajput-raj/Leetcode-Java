class Solution {
    public int reverse(int x) {
        if(x < 0){      //x = -123
            int y = (-1)*x;       //y=123 
            long rev1 = 0;          
        while(y>0){
        int rem = y % 10;
        rev1 = rev1*10 + rem;
        y = y/10;
       }
       if(rev1 > Integer.MAX_VALUE) return 0;
       return (-1) * (int)rev1;          //rev1 = -321
        }
      else{
        long rev = 0;
       while(x>0){
        int rem = x % 10;
        rev = rev*10 + rem;
        x = x/10;
       }
       if(rev > Integer.MAX_VALUE) return 0;
       return (int)rev;
       } 
    }
}