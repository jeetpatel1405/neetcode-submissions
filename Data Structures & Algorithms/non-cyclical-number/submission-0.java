class Solution {
    public int sumOfDigits(int n)
    {
        int sum=0,r=0;
        while(n!=0)
        {
            r = n%10;
            n/=10;

            sum+=r*r;
        }
        return sum;
    }
    public boolean isHappy(int n) {

        int[] arr = new int[1000000];
        int i=0;
        while(i<1000000)
        {
            n = sumOfDigits(n);
            if(n==1) return true;
            else arr[n]=1;
            i++;
        }

        return false;
    }
}
