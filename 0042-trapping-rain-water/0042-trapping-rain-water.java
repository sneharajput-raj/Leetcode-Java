class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;
        while(low < high){
            if(height[low] <= height[high]){
                if(height[low] >= leftMax){
                    leftMax = height[low];
                }
                else{
                    totalWater += leftMax - height[low];
                }
                low++;
            }
            else{
                if(height[high] >= rightMax){
                    rightMax = height[high];
                }
                else{
                    totalWater += rightMax - height[high];
                }
                high--;
            }
        }
        return totalWater;
    }
}