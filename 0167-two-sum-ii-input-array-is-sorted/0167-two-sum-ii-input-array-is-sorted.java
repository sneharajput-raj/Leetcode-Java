class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];
        int low = 0;
        int high = n-1;
        while(low < high){
            if(numbers[low] + numbers[high] == target){
                ans[0] = low + 1;      //index + 1
                ans[1] = high + 1;
                return ans;
            }
            else if(numbers[low] + numbers[high] > target){
                high--;
            }
            else{
                low++;
            }
        }
        return ans;
    }
}
//T.C. = O(N/2) ~ O(N)
//S.C. = O(2)