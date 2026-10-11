class Solution {
    public double myPow(double x, int n) {
        double prod = 1;
        int itr = Math.abs(n);
        for(int i=1;i<=itr;i++){
            if(n>=0) prod*=x;
            else prod/=x;
        }
        return prod;
    }
}
