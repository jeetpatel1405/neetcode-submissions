class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            int cnt = 0;
            for(int j=i;j<n;j++)
            {
                if(temperatures[i]<temperatures[j]) {
                    ans[i] = cnt;
                    break;
                }
                else cnt++;
            }
        }
        return ans;
        
    }
}
