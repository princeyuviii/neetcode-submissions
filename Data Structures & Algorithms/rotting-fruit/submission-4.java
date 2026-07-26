class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
        for(int r=0; r<rows ; r++){
            for(int c=0; c<cols ; c++){
                if(grid[r][c]==2){
                    q.offer(new int[]{r,c});
                }
                if(grid[r][c]==1){
                    fresh++;
                }
            }
        }

        int min = 0;
 
        if(fresh==0){
            return 0;
        }

        int[][] dirs = {
            {-1,0},{1,0},{0,-1},{0,1}
        };

        while(!q.isEmpty() && fresh>0 ){

            int size = q.size();

            for(int i=0; i<size; i++){
                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for(int[] dir : dirs){
                    int newR = r + dir[0];
                    int newC = c + dir[1];

                    if(newR < 0 || newR >=rows || newC < 0 || newC >=cols){
                        continue;
                    }

                    if(grid[newR][newC]!=1){
                        continue;
                    }

                    grid[newR][newC] = 2;
                    fresh--;

                    q.offer(new int[]{newR,newC});
                }
            }
            min++;
        }
        return fresh==0?min:-1;
    }
}
