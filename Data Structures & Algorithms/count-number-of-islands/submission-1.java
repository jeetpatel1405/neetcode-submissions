class Solution {
    public void dfs(int sr,int sc,char[][] grid,boolean[][] visited, int m,int n)
    {
        visited[sr][sc] = true;

        int dr[]= {-1,0,1,0};
        int dc[]={0,-1,0,1};
        for(int i=0;i<4;i++)
        {
            int newr = sr+dr[i];
            int newc = sc+dc[i];
            if(newr>=0 && newc>=0 && newr<m && newc<n && grid[newr][newc]=='1' && !visited[newr][newc]){
                dfs(newr,newc,grid,visited,m,n);
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
                    dfs(i,j,grid,visited,row,col);
                    count++;
                }
            }
        }
        return count;
    }
}
