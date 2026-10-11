class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, z=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) prod*=nums[i];
            else z++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(z>1) nums[i]=0;
            else if(nums[i]!=0) {
                if(z==0) nums[i] = prod/nums[i];
                else nums[i]=0;
            }
            else nums[i] = prod;
        }
        return nums;
    }
}  
