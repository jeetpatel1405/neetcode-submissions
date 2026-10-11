class MinStack {
    int minn=Integer.MAX_VALUE;

    Stack<Integer> st = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        minn = Math.min(minn,val);
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
        minn = Integer.MAX_VALUE;
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty())
        {
            int val = st.peek();
            temp.push(val);
            minn = Math.min(minn,val);
            st.pop();
        }
        while(!temp.isEmpty())
        {
            st.push(temp.peek());
            temp.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minn;
    }
}
