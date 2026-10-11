class Solution {
    public void bfs(int sr,int sc,char[][] board,boolean[][] visited,int m,int n)
    {
        Queue<int[]> q= new LinkedList<>();
        q.offer(new int[]{sr,sc});
        visited[sr][sc]= true;
        int[] dr={0,-1,0,1};
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
                
                if(newr>=0 && newc>=0 && newr<m && newc<n && board[newr][newc]=='O' && !visited[newr][newc])
                {
                    visited[newr][newc]=true;
                    q.offer(new int[]{newr,newc});
                }
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
                    if(board[i][j]=='O' && !visited[i][j]) bfs(i,j,board,visited,m,n);
                }
                if(j==0 || j==n-1) 
                {
                    if(board[i][j]=='O' && !visited[i][j]) bfs(i,j,board,visited,m,n);
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
