class Solution {
    public int[] productExceptSelf(int[] nums) {
        int z = 0;
        int prod = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) z++;
            else prod*=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(z>1) nums[i] = 0;
            else if(z==1) {
                if(nums[i]!=0) nums[i]=0;
                else nums[i] = prod;
            }
            else{
                nums[i] = prod/nums[i];
            }
        }
        return nums;
    }
}  
