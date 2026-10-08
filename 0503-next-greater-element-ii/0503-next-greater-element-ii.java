class Solution {
    public int[] nextGreaterElements(int[] nums){
        int x=nums.length;
        int ans[]=new int[x];
        Stack<Integer> st=new Stack<>();
        for(int i=2*x-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%x]){
                st.pop();
            }
            if(i<x) ans[i]=st.isEmpty()?-1:st.peek();
            
            st.push(nums[i%x]);
        }
        return ans;

        
        
    }
}