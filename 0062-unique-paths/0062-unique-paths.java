class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i=0; i<n; i++){    //i == column --> use column traversal for row 
            arr[0][i] = 1;        //0th row fill
        }
        for(int i=0; i<m; i++){   //i == rows    --> use row traversal for column
            arr[i][0] = 1;        //0th column ki sari rows fill
        }
        for(int i=1; i<m; i++){      //1st row
            for(int j=1; j<n; j++){   //all cols
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        return arr[m-1][n-1];
    }
}