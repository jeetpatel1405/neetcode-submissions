class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> arr = new ArrayList<Integer>();
        int carry=1,n=digits.length,val=0;
        for(int i=n-1;i>=0;i--)
        {
            val = (digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            digits[i] = val;

        }
        if(carry==0) return digits;
        
        int[] newArr = new int[n+1];
        newArr[0] = carry;
        for(int i=1;i<n;i++) newArr[i] = digits[i];
        return newArr;
    
    }
}
