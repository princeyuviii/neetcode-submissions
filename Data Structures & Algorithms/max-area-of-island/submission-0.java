class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int mx = 0;

        for(int r=0 ; r<rows ; r++){
            for(int c=0 ; c<cols ; c++){
                if(grid[r][c]== 1 ){
                    int area = dfs(grid, r, c);
                    mx = Math.max(mx, area);
                }
            }
        }
        return mx;
    }

    private int dfs(int[][] grid, int r, int c){
        int rows = grid.length;
        int cols = grid[0].length;

        if(r < 0 || c < 0 || r >= rows || c >= cols){
            return 0;
        }

        if(grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0 ;

        int up = dfs(grid, r-1, c);
        int down = dfs(grid, r+1, c);
        int left = dfs(grid, r, c-1);
        int right = dfs(grid, r, c+1);

        return 1 + up + down + left + right;
    }
}
