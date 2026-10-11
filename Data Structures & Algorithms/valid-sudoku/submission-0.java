class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        for(int i=0;i<9;i++)
        {
            int[] arr = new int[10];
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.') {
                    int val = (int)board[i][j]-48;
                    if(arr[val]!=1) arr[val]=1;
                    else return false;
                }

            }
        }
        System.out.println("Hiii");
        for(int i=0;i<9;i++)
        {
            int[] arr = new int[10];
            for(int j=0;j<9;j++)
            {
                // int[] arr = {};
                if(board[j][i]!='.') {
                    int val = (int)board[j][i]-48;
                    if(arr[val]!=1) arr[val]=1;
                    else return false;
                }

            }
        }
        System.out.println("Hiii");
        int k=0;
        int m=0;
        for(int itr=0;itr<9;itr++)
        {
            int[] arr = new int[10];
            for(int i=k;i<k+3;i++)
            {

                for(int j=m;j<m+3;j++)
                {
                    if(board[i][j]!='.') {
                        int val = (int)board[i][j]-48;
                        // System.out.println(board[i][j]);
                        // System.out.println(val);
                        if(arr[val]!=1) arr[val]=1;
                        else return false;
                    }
                }
            }
            System.out.println();
            // System.out.println(itr);
            if(m+3<=6) m+=3;
            else{
                if(k+3>6) break;    
                else{
                    k+=3;
                    m=0;
                }
            }
        }
        return true;
    }
}
