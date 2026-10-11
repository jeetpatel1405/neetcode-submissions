class Solution {
    public void bfs(int sr,int sc,char[][] grid,boolean[][] visited, int m,int n)
    {
        Queue<int[]> q = new LinkedList<>();
        int dr[] = {1,0,-1,0};
        int dc[] = {0,1,0,-1};

        q.offer(new int[]{sr,sc});
        visited[sr][sc]=true;
        while(!q.isEmpty())
        {
            int currR = q.peek()[0];
            int currC = q.peek()[1];
            q.poll();
            for(int i=0;i<4;i++)
            {
                int newR = currR+dr[i];
                int newC = currC+dc[i];

                if(newR>=0 && newC>=0 && newR<m && newC<n && grid[newR][newC]=='1' && !visited[newR][newC])
                {
                    q.offer(new int[]{newR,newC});
                    visited[newR][newC] = true;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][] = new boolean[row][col];
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    bfs(i,j,grid,visited,row,col);
                    count++;
                }
            }
        }
        return count;
    }
}
