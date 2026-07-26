class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int positiveMaxPro = nums[n-1] * nums[n-2] * nums[n-3];   //jb sare number +ve ho toh last ke 3 number max honge
        int negativeMaxPro = nums[0] * nums[1] * nums[n-1];  //pr jb -ve numbers ho array me toh->  phle do number ka product krenge toh +ve product milga or last jo +ve number h uska bi product krenge toh max numbers 
        int maxPro = Math.max(positiveMaxPro , negativeMaxPro);
        return maxPro;
    }
}