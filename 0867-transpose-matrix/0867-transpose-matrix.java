class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] num = new int[cols][rows];   //phle cols fill honge phir rows
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                num[j][i] = matrix[i][j];   //row ko col mein transfer
            }
        }
        return num;
    }
}