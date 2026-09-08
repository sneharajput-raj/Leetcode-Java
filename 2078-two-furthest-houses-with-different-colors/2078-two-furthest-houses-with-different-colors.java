class Solution {
    public int maxDistance(int[] colors) {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<colors.length; i++){
            for(int j=1; j<colors.length; j++){
                if(colors[i] != colors[j]) {
                    int dis = Math.abs(i-j);
                    ans = Math.max(ans, dis);
                }
            }
        }
        return ans;
    }
}