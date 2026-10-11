class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void findSubsets(int[] nums,List<Integer> temp,int i)
    {
        if(nums.length-1<i)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        findSubsets(nums,temp,i+1);
        temp.remove(temp.size()-1);
        findSubsets(nums,temp,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        findSubsets(nums,temp,0);
        return result;
    }
}
