class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int val = target-nums[i];
            if(mp.containsKey(val)) {
                arr[0]=mp.get(val);
                arr[1] = i; 
            }
            mp.put(nums[i],i);
        }
        return arr;
    }
}
