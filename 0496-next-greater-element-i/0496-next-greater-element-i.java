class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                mp.put(st.pop(),num);
            }
            st.push(num);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=mp.getOrDefault(nums1[i],-1);    
        }
        return ans;
    }
}