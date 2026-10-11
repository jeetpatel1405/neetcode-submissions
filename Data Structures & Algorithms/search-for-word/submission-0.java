class Solution {
    public boolean find(char[][] board,int idx,int cr,int cc,String word,int m,int n)
    {
        if(cr<0 || cc<0 || cr>=m || cc>=n || board[cr][cc]=='.' || board[cr][cc]!=word.charAt(idx)) return false;

        if(idx==word.length()-1) return true;

        char temp = board[cr][cc];
        board[cr][cc] = '.'; 

        int[] dr = {0,-1,0,1};
        int[] dc = {1,0,-1,0};
        for(int i=0;i<4;i++)
        {
            int newr = cr+dr[i];
            int newc = cc+dc[i];
            if(find(board,idx+1,newr,newc,word,m,n)) return true;
        }
        board[cr][cc] = temp;
        return false;

    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0) && find(board,0,i,j,word,m,n)) return true;
                
            }
        }
        return false;
    }
}