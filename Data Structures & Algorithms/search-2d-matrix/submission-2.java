class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = m-1;
        int in = 0;
        while(l<=r)
        {
            in = (r+l)/2;
            System.out.println(in);
            if(matrix[in][0]==target || matrix[in][n-1]==target) return true;
            else if(matrix[in][0]<target && matrix[in][n-1]>target) break;
            else if(matrix[in][n-1]<target) l = in+1;
            else r = in-1;
        }
        l =0 ;
        r = n-1;
        while(l<=r)
        {
            int mid = (r+l)/2;
            if(matrix[in][mid]==target) return true;
            else if(matrix[in][mid]<target) l = mid+1;
            else r = mid-1;
        }
        return false;
    }
}
