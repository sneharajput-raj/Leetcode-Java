class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] copy = new int[n];
        int j = 0;
        k = k % n;       //jab 'k' 'n' se bada ho to 'k' ko range me lane ke liye
        for(int i=n-k; i<n; i++){
            copy[j] = nums[i];
            j++;
        }
        for(int i=0; i<n-k; i++){
            copy[j] = nums[i];
            j++;
        }
        for(int i=0; i<n; i++){
            nums[i] = copy[i];
        }
    }
}