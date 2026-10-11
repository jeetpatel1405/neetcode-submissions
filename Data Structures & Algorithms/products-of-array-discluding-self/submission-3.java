class Solution {

    public int[] prefixArray(int[] nums)
    {
        int[] pre = new int[nums.length];
        int prod=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0) {
                pre[i] = prod;
            }
            else{
                pre[i] = prod*nums[i-1];
            }
            prod = pre[i];
        }
        return pre;
    }
    public int[] postfixArray(int[] nums)
    {
        int prod = 1;
        int n = nums.length;
        int[] pos = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1){
                pos[i] = prod;
            }
            else{
                pos[i] = prod*nums[i+1];
            }
            prod = pos[i];
        }
        return pos;
    }
    public int[] productExceptSelf(int[] nums) {
        int z=0;
        int prod = 1;
        int[] pre = prefixArray(nums);
        int[] pos = postfixArray(nums);
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = pre[i]*pos[i];
        }
        return nums;
    }
}  
