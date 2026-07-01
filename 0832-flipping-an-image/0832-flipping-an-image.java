class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int[] row : image){
            int left = 0;
            int right = n-1;

            while(left <= right){
                //if elements are same, they both flip and invert
                if(row[left] == row[right]){
                    int newVal = row[left] ^ 1;
                    row[left] = newVal;
                    row[right] = newVal;
                }
                //if they are different, they remain unchanged after flip + invert
                left++;
                right--;
            }
        }
        return image;
    }
}