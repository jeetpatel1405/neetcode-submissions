class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i=0;i<nums.length;i++)
        {
            if(pq.isEmpty()) pq.add(nums[i]);
            else if(k>pq.size()) pq.add(nums[i]);
            else{
                if(pq.peek()<nums[i]) 
                {
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }

    }
    
    public int add(int val) {
        if(pq.isEmpty() || pq.size()<k) pq.add(val);
        else if(pq.peek()<val) {
            pq.poll();
            pq.add(val);
        }

        if(pq.size()<k) return -1;
        return pq.peek();
    }
}
