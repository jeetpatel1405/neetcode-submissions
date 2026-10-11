class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        
        if(maxHeap.isEmpty() || maxHeap.peek()>num) maxHeap.offer(num);
        else minHeap.offer(num);

        if(maxHeap.size()-minHeap.size()>1) 
        {
            minHeap.offer(maxHeap.peek());
            maxHeap.poll();
        }
        else if(minHeap.size()>maxHeap.size())
        {
            maxHeap.offer(minHeap.peek());
            minHeap.poll();
        }


    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()) return ((double)maxHeap.peek()+(double)minHeap.peek())/2;
        return maxHeap.peek();
    }
}
