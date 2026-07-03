class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}