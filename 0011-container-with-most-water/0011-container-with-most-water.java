class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int low = 0;
        int high = n-1;

        while(low < high){
            int currArea = Math.min(height[low], height[high]) * (high - low);
            maxArea = Math.max(maxArea, currArea);
            if(height[low] < height[high]) low++;
            else high--;
        }
        return maxArea;
    }
}