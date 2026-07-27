class Solution {

    int rows;
    int cols;

    int[][] dirs = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        rows = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

         for(int c=0 ; c<cols ; c++){
            dfs(heights, 0,c ,pacific);
        }

        for(int r=0 ; r<rows ; r++){
            dfs(heights, r,0 ,pacific);
        }

        for(int c=0 ; c<cols ; c++){
            dfs(heights,rows-1 ,c , atlantic);
        }

        for(int r=0 ; r<rows ; r++){
            dfs(heights,r ,cols-1 , atlantic);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int r=0 ; r<rows ; r++){
            for(int c=0 ; c<cols ; c++){
                if(pacific[r][c] && atlantic[r][c]){
                    ans.add(Arrays.asList(r,c));
                }
            }
        }
        return ans;

    }

    private void dfs(int[][] heights , int r , int c , boolean[][]visited){
        visited[r][c] = true;

        for(int[] dir : dirs){
            int newR = r + dir[0];
            int newC = c + dir[1];

            if(newR < 0 || newR >= rows || newC < 0 || newC >= cols){
                continue;
            }

            if(visited[newR][newC]){
                continue;
            }

            if(heights[newR][newC] < heights[r][c]){
                continue;
            }

            dfs(heights, newR, newC, visited);
        }
        

    }
}
