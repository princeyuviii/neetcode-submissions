class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int r=0; r<rows ; r++){
            for(int c=0; c<cols ; c++){
                if(grid[r][c] == 0){
                    q.offer(new int[]{r,c});
                }
            }
        }

        int[][] dirs = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!q.isEmpty()){
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for(int[] dir : dirs){
                int newR = r + dir[0];
                int newC = c + dir[1];

                if(newR < 0 || newR >= rows || newC < 0 || newC >= cols){
                    continue;
                }

                if(grid[newR][newC]!= Integer.MAX_VALUE){
                    continue;
                }

                grid[newR][newC] = grid[r][c] + 1;

                q.offer(new int[]{newR,newC});
            }
        } 
    }
}
