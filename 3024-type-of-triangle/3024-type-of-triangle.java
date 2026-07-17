class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        String ans = "";
        if(a+b > c && b+c > a && c+a > b){
            if(a==b && b==c && c==a){
                ans = ans + "equilateral";
            }
            else if(a==b || b==c || c==a){
                ans = ans + "isosceles";
            }
            else{
                ans = ans + "scalene";
            }
        }
        else{
            ans = ans + "none";
        }
        return ans;
    }
}