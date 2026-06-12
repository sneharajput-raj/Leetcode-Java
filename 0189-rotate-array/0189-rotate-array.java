class Solution {
    public void rotate(int[] nums, int k) {
        //Reverseral algorithm
        int n = nums.length;
        k = k%n;    //k array size se bada hoo
        reverse(nums, 0, n-1);  //pura array reverse
        reverse(nums, 0, k-1);  //k elements ko reverse
        reverse(nums, k, n-1);  //remaining elements reverse
    }
    public  void reverse(int[] nums, int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
//T.C --  O(n)
//S.C --  O(1)