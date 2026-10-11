class Solution {
    public void bfs(int root,List<List<Integer>> adjL,boolean[] visited)
    {
        Queue<Integer> q = new LinkedList<>();
        visited[root] = true;
        q.offer(root);

        while(!q.isEmpty())
        {
            int curr = q.poll();
            for(int edge: adjL.get(curr))
            {
                if(!visited[edge])
                {
                    q.offer(edge);
                    visited[edge] = true;
                }
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
                bfs(i,adjL,visited);
                count++;
            }
        }
        return count;
    }
}
