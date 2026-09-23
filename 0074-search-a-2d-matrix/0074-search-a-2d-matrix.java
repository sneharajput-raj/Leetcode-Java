class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int n  = row * col;

        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int rowIndex = mid / col;
            int colIndex = mid % col;

            if(matrix[rowIndex][colIndex] == target) return true;
            else if(matrix[rowIndex][colIndex] > target) high = mid - 1;
            else low = mid+1;
        }
        return false;
    }
}