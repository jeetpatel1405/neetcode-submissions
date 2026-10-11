class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    int st1 = 0,st2=0;
    for(int i=0;i<stones.length;i++)  pq.add(stones[i]);

    while(pq.size()!=1)
    {
        st2 = pq.poll();
        st1 = pq.poll();
        if(st1<st2) pq.add(st2-st1);
        else if(pq.size()==0) return 0;
    }
    return pq.poll();
    
    }
}
