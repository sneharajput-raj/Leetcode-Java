class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans = -1;
        int minCapacity = Integer.MAX_VALUE;
        for(int i=0; i<capacity.length; i++){
            int currValue = capacity[i];
            if(capacity[i] >= itemSize && capacity[i] < minCapacity){
                minCapacity = capacity[i];
                ans = i;
            }
        }
        return ans;
    }
}