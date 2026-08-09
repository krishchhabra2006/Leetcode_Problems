class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        
        String op="+-*/";
        for(String t:tokens){
            if(op.indexOf(t)!=-1){
                int d2=st.pop();
                int d1=st.pop();
                int res=0;
                if(t.equals("+")) res=d1+d2;
                else if(t.equals("-")) res=d1-d2;
                else if(t.equals("*")) res=d2*d1;
                else if(t.equals("/")) res=d1/d2;
                st.push(res);

            }
            else {
                st.push(Integer.parseInt(t));
            }
            
        }
        return st.peek();
        
        
        
    }
}