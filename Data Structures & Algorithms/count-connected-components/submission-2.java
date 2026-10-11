class Solution {
    public int find(int[] par,int x)
    {
        if(x==par[x]) return par[x];
        return par[x] = find(par,par[x]);
    }
    public void union(int[] par,int x,int y)
    {
        int px = find(par,x);
        int py = find(par,y);

        if(px!=py)
        {
            par[px] = py;
        }
    }
    public int countComponents(int n, int[][] edges) {
        int[] par = new int[n];
        for(int i=0;i<n;i++) par[i] = i;

        int comp = n;
        for(int[] edge:edges)
        {
            if(find(par,edge[0])!=find(par,edge[1]))
            {
                union(par,edge[0],edge[1]);
                comp--;
            }
        }
        return comp;
    }
}
