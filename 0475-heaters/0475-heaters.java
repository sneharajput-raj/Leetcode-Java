class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int n = houses.length;
        int m = heaters.length;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int maxRadius = 0;
        int j = 0;  //pointer for heaters

        for(int i=0; i<n; i++){   //traverse in houses 
            while(j < m-1 && Math.abs(heaters[j+1] - houses[i]) <= Math.abs(heaters[j] - houses[i])){
                j++;
            }
            int currDist = Math.abs(heaters[j] - houses[i]);
            maxRadius = Math.max(maxRadius, currDist);
        }
        return maxRadius;
    }
}