class Solution {
    public void bfs(int sr,int sc,int[][] grid,boolean[][] visited,int m,int n,int[] count)
    {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        visited[sr][sc] = true;
        count[0]++;
        int[] dr = {0,-1,0,1};
        int[] dc = {1,0,-1,0};
        while(!q.isEmpty())
        {
            int r = q.peek()[0];
            int c = q.peek()[1];
            q.poll();

            for(int i=0;i<4;i++)
            {
                int newr = r+dr[i];
                int newc = c+dc[i];

                if(newr>=0 && newc>=0 && newr<m && newc<n && grid[newr][newc]==1 && !visited[newr][newc])
                {
                    count[0]++;
                    visited[newr][newc]=true;
                    q.offer(new int[]{newr,newc});
                }
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
                    bfs(i,j,grid,visited,row,col,count);
                    maxCount = Math.max(count[0],maxCount);
                }
            }
        }
        return maxCount;
    }
}