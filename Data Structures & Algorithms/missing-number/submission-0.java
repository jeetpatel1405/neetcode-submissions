class Solution {
    public int missingNumber(int[] nums) {
        int n=0,len = nums.length;
        for(int i=0;i<nums.length;i++) n+=nums[i];
        return (len*(len+1)/2) - n;
    }
}
