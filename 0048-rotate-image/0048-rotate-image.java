class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //1... Transpose matrix (in upper bound)
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){  //only diagonal ke upr wle elements swap(transpose)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //2...  reverse row
        for(int i=0; i<n; i++){
            int startCol = 0;
            int endCol = n-1;

            while(startCol <= endCol){
                int temp = matrix[i][startCol];
                matrix[i][startCol] = matrix[i][endCol];
                matrix[i][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
    }
}