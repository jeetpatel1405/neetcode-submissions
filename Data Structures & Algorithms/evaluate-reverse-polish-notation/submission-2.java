class Solution {
    public boolean isOperator(String s)
    {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
   
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int val1 = 0;
        int val2 = 0;

        for(int i=0;i<tokens.length;i++)
        {
            if(isOperator(tokens[i])) 
            {
                if(tokens[i].equals("+")) 
                {
                    if(!st.isEmpty()) val1 = Integer.valueOf(st.pop());
                    if(!st.isEmpty()) val2 = Integer.valueOf(st.pop());
                    st.push(val1+val2); 
                }
                 else if(tokens[i].equals("-")) 
                {
                    if(!st.isEmpty()) val1 = Integer.valueOf(st.pop());
                    if(!st.isEmpty()) val2 = Integer.valueOf(st.pop());
                    st.push(val2-val1); 
                }  
                else if(tokens[i].equals("/")) 
                {
                    if(!st.isEmpty()) val1 = Integer.valueOf(st.pop());
                    if(!st.isEmpty()) val2 = Integer.valueOf(st.pop());
                    st.push(val2/val1); 
                }  
                else if(tokens[i].equals("*")) 
                {
                    if(!st.isEmpty()) val1 = Integer.valueOf(st.pop());
                    if(!st.isEmpty()) val2 = Integer.valueOf(st.pop());
                    st.push(val1*val2); 
                }

            }
            else st.push(Integer.valueOf(tokens[i]));

        }
        return st.pop();
    }
}
