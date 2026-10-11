class Solution {
    public void dfs(int sr,int sc,int[][] grid,boolean[][] visited,int m,int n,int[] count)
    {
        visited[sr][sc] = true;
        count[0]++;
        int[] dr = {0,-1,0,1};
        int[] dc = {1,0,-1,0};

        for(int i=0;i<4;i++)
        {
            int newR = sr+dr[i];
            int newC = sc +dc[i];
            if(newR>=0 && newC>=0 && newR<m && newC<n && grid[newR][newC]==1 && !visited[newR][newC])
            {
                dfs(newR,newC,grid,visited,m,n,count);
            }
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int maxCount = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1 && !visited[i][j])
                {
                    int count[] = new int[1];
                    dfs(i,j,grid,visited,row,col,count);
                    maxCount = Math.max(count[0],maxCount);
                }
            }
        }
        return maxCount;
    }
}