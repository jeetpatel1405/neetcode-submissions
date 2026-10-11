class Solution {
    public int findMin(int[] arr) {
        int low=0,high = arr.length-1,ans = Integer.MAX_VALUE,mid=0;
        while(low<=high)
        {
            mid = (high+low)/2;
            if(arr[low]<=arr[mid])
            {
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }
            else{
                high = mid-1;
                ans = Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }
}
