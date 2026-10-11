class Solution {
    public int check(String str)
    {
        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
        {
            if(str.equals("+")) return 200;
            else if(str.equals("-")) return 300;
            else if(str.equals("*")) return 400;
            else if(str.equals("/")) return 500;
        }
        return Integer.parseInt(str);
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++)
        {
            int op = check(tokens[i]);
            System.out.println(op);
            int val1=0;
            int val2 = 0;
            if(op>=200 && op<=500) 
            {
                val1 = st.peek();
                st.pop();
                val2 = st.peek();
                st.pop();
                if(op==200) st.push((val1+val2));
                else if(op==300) st.push((val2-val1));
                else if(op==400) st.push((val2*val1));
                else st.push((val2/val1));
            }
            else st.push(op);
            
        }
        return st.peek();
    }
}
