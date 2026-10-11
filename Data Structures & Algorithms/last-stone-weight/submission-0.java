class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int x=0,y=0;
        for(int i=0;i<stones.length;i++) pq.add(stones[i]);
        while(pq.size()!=1)
        {
            y = pq.poll();
            x = pq.poll();
            if(x<y) pq.add(y-x);
            else if(pq.size()==0) return 0;
        }
        
        return pq.poll();
    
    }
}
