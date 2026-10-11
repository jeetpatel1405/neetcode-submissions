class Solution {
    public int find(int[] parent,int x)
    {
        if(x==parent[x]) return parent[x];
        return parent[x] = find(parent,parent[x]);
    }
    public void union(int[] parent,int x,int y)
    {
        int px = find(parent,x);
        int py = find(parent,y);
        if(px!=py)
        {
            parent[px] = py;
            count--;
        }
    }
    int count = 0;
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] parent = new int[row*col+1];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1')
                {
                    int id = i*col+j;
                    parent[id] = id;
                    count++;

                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1')
                {
                    if(i+1<row && grid[i+1][j]=='1')
                    {
                        union(parent,i*col+j,(i+1)*col+j);
                    }
                    if(j+1<col && grid[i][j+1]=='1')
                    {
                        union(parent,i*col+j,i*col+j+1);
                    }
                }
            }

        }
        return count;
    }
}
