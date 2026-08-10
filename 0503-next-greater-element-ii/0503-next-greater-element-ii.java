class Solution {
    public int[] nextGreaterElements(int[] nums){
        int x=nums.length;
        int []ans=new int[x];
        Stack<Integer>s=new Stack<>();
        for(int i=2*x-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i%x]){
                s.pop();
            }
            if(i<x) ans[i]=s.isEmpty()?-1: s.peek();

            s.push(nums[i%x]);
        }
        return ans;
        
    }
}