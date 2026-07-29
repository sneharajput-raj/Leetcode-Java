class Solution {
    public boolean isValid(char[][] board, int row, int col, int ch){
        //horizontally
        for(int j=0; j<9; j++){
            if(board[row][j] == ch) return false;
        }
        //vertically
        for(int i=0; i<9; i++){
            if(board[i][col] == ch) return false;
        }
        //for 3x3 grid
        int rgrid = row/3 * 3;
        int cgrid = col/3 * 3;
        for(int i=rgrid; i<rgrid+3; i++){
            for(int j=cgrid; j<cgrid+3; j++){
                if(board[i][j] == ch) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    char ch = board[i][j];
                    board[i][j] = '.';
                    if(isValid(board, i, j, ch) == false) return false;
                    board[i][j] = ch;
                }
            }
        }
        return true;
    }
}