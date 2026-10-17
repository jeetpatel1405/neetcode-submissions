class Solution {
    public boolean check(String s)
    {
        int l = 0;
        int h = s.length()-1;


        while(l<=h)
        {
            char val1 = s.charAt(l);
            char val2 = s.charAt(h);
            if(Character.isLetterOrDigit(val1) && Character.isLetterOrDigit(val2)) 
            {
                if(Character.toLowerCase(val1)!=Character.toLowerCase(val2)) return false;
                l++;
                h--;
            }
            else if(Character.isLetterOrDigit(val1)) h--;
            else l++;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        return check(s);
    }
}
