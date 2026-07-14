class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int subArr = 0;
        int sum = 0;
        int targetSum = k * threshold;
        for(int i=0; i<k; i++){
            sum = sum + arr[i]; 
        }
         if((sum / k) >= threshold) subArr++;
        for(int i=1; i<=n-k; i++){
            sum -= arr[i-1];
            sum += arr[i+k-1];
            if((sum / k) >= threshold) subArr++;
        }
        return subArr;
    }
}