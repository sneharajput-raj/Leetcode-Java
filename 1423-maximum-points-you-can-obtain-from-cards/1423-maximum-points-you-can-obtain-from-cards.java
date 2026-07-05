class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] arr = cardPoints;
        int n = arr.length;
        int lsum = 0;
        int rsum = 0;
        int li = n-1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            lsum = lsum + arr[i];
        }
        max = lsum;
        for(int i=k-1; i>=0; i--){
            lsum = lsum - arr[i];
            rsum = rsum + arr[li];
            li--;
            max = Math.max(max, lsum+rsum);
        }
        return max;
    }
}