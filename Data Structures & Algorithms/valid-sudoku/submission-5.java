class Solution {

    public boolean isValidSudoku(char[][] board) {
       
        for(int r=0 ; r<9 ; r++){
            HashSet<Character> hs = new HashSet<>();
            for(int c=0 ; c<9; c++){
                if(board[r][c]=='.'){
                    continue;
                }
                if(hs.contains(board[r][c])){
                    return false;
                }
                hs.add(board[r][c]);
            }
        }

        for(int c=0 ; c<9 ; c++){
            HashSet<Character> hs = new HashSet<>();
            for(int r=0 ; r<9; r++){
                if(board[r][c]=='.'){
                    continue;
                }
                if(hs.contains(board[r][c])){
                    return false;
                }
                hs.add(board[r][c]);
            }
        }

        for(int rows=0 ; rows<9 ; rows+=3){
            for(int cols=0 ; cols<9 ; cols+=3){
                HashSet<Character> hs = new HashSet<>();
                for(int i=rows ; i<rows+3 ; i++){
                    for(int j=cols ; j<cols+3 ; j++){

                        if(board[i][j]=='.'){
                            continue;
                        }
                        if(hs.contains(board[i][j])){
                            return false;
                        }
                        hs.add(board[i][j]);
                    }
                }
            }
        }



        return true;
    }
}
