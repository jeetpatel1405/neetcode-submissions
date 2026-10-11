class Solution {
    public void dfs(int sr,int sc,char[][] board,boolean[][] visited,int m,int n)
    {
        visited[sr][sc] = true;

        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};
        
        for(int i=0;i<4;i++)
        {
            int newR = sr+dr[i];
            int newC = sc+dc[i];

            if(newR>=0 && newC>=0 && newR<m && newC<n && board[newR][newC]=='O' && !visited[newR][newC])
            {
                dfs(newR,newC,board,visited,m,n);
            }
        }
    }
    public void solve(char[][] board) {
        
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==m-1)
                {
                    if(board[i][j]=='O' && !visited[i][j]) dfs(i,j,board,visited,m,n);
                }
                if(j==0 || j==n-1) 
                {
                    if(board[i][j]=='O' && !visited[i][j]) dfs(i,j,board,visited,m,n);
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O' && !visited[i][j])
                {
                    board[i][j]='X';
                }
            }
        }
    }
}
