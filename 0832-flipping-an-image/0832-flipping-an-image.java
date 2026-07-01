class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;
            while(left < right){
                //reverse the row using swapping
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
            //invert row using XOR
            for(int j=0; j<n; j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;
    }
}