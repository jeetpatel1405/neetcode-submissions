class Solution {
    public int checkCharacter(char c)
    {
        if((int)c>=97 && (int)c<=122) return (int)c;
        else if((int)c>=65 && (int)c<=90) return (int)c+32;
        else if((int)c>=48 && (int)c<=57) return (int)c;
        else return -1;
        
    }
   
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            int val1 = checkCharacter(s.charAt(i));
            int val2 = checkCharacter(s.charAt(j));

            if(val1==-1) i++;
            else if(val2==-1) j--;
            else if(val1!=-1 && val2!=-1)
            {
                
                if(val1!=val2) return false;
                i++;
                j--;
            }

        }
        return true;
    }
}
