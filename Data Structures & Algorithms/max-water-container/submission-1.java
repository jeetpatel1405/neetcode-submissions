class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxm=0,ans=0,val=0;
        while(i<j)
        {
            
            if(heights[i]<heights[j])
            {
                val = (j-i)*heights[i];
                if(val>maxm) maxm = val;   
                i++;
                
            }
            else 
            {
                val = (j-i)*heights[j];
                if(val>maxm) maxm = val;
                j--;
            }
        }
        return maxm;
    }
}
