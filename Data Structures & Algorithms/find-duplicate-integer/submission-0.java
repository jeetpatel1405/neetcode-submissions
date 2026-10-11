class Solution {
    public int findDuplicate(int[] nums) {
        ArrayList<Integer> lt = new ArrayList<>();
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(lt.contains(nums[i])) break;
            else lt.add(nums[i]);
        }
        return nums[i];
    }
}
