class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length) return nums;

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i])) mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            else mp.put(nums[i],1);
        }
        Queue<Integer> q  = new PriorityQueue<>(
            (a,b) -> mp.get(a) - mp.get(b)
        );
        for(int num:mp.keySet())
        {
            q.add(num);
            if(q.size()>k) q.poll();
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = q.poll();
        }
        return ans;
    }
}
