class Solution {
    public int count(char[][] board , int Rr, int Rc){
        int count = 0;
        //UP
        for(int i=Rr-1; i>=0; i--){
            if(board[i][Rc] == 'p'){
                count++;
                break;
            }
            else if(board[i][Rc] == 'B') break;
        }
        //DOWN
        for(int i=Rr+1; i<8; i++){
            if(board[i][Rc] == 'p'){
                count++;
                break;
            }
            else if(board[i][Rc] == 'B') break;
        }
        //RIGHT
        for(int j=Rc+1; j<8; j++){
            if(board[Rr][j] == 'p'){
                count++;
                break;
            }
            else if(board[Rr][j] == 'B') break;
        }
        //LEFT
        for(int j=Rc-1; j>=0; j--){
            if(board[Rr][j] == 'p'){
                count++;
                break;
            }
            else if(board[Rr][j] == 'B') break;
        }
        return count;
    }
    public int numRookCaptures(char[][] board) {
        int Ri = -1;
        int Rj = -1;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j] == 'R'){
                    return count(board, i, j);        //up, down, left, right
                }
            }
        }
        return 0;
    }
}