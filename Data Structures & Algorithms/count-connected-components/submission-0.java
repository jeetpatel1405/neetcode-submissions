class Solution {
    public void dfs(int root,List<List<Integer>> adjL,boolean[] visited)
    {
        visited[root] = true;

        for(int edge:adjL.get(root))
        {
            if(!visited[edge])
            {
                dfs(edge,adjL,visited);
            }
        }
    }
    public List<List<Integer>> getList(int[][] edges,int n)
    {
        List<List<Integer>> adjL = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adjL.add(new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            adjL.get(edge[0]).add(edge[1]);
            adjL.get(edge[1]).add(edge[0]);
        }
        return adjL;
    }
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        int count=0;
        List<List<Integer>> adjL = getList(edges,n);
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                dfs(i,adjL,visited);
                count++;
            }
        }
        return count;
    }
}
