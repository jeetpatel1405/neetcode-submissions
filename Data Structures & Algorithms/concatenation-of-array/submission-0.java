class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int m = nums.length;
        int[] arr = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = nums[k];
            k = (k+1)%m;
        }
        return arr;
    }
}