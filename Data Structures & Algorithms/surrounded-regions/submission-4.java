class Solution {

        int rows;
        int cols;
        int[][] dirs = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;

        for(int c=0 ; c<cols ; c++){
            if(board[0][c]=='O'){
                dfs(board,0 ,c);
            }

            if(board[rows-1][c]=='O'){
                dfs(board,rows-1,c);
            }
        }

        for(int r=0 ; r<rows ; r++){
            if(board[r][0]=='O'){
                dfs(board, r, 0);
            }

            if(board[r][cols-1]=='O'){
                dfs(board, r, cols-1);
            }
        }

        for(int r=0 ; r<rows ; r++){
            for(int c=0 ; c<cols ; c++){
                if(board[r][c] == 'O'){
                    board[r][c] = 'X';
                }

                if(board[r][c]=='#'){
                    board[r][c] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board,int r,int c){

        if(r<0 || r>=rows || c<0 || c>=cols){
            return;
        }

        if(board[r][c]!='O'){
            return;
        }

        board[r][c] = '#'; 

        for(int[] dir : dirs){
            int newR = r + dir[0];
            int newC = c + dir[1];

            dfs(board, newR, newC);
        }
    }
}
