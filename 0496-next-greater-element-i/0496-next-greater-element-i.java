class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack <Integer> s=new Stack<>();
        for(int num:nums2){
            while(!s.isEmpty() && s.peek()<num){
                map.put(s.pop(),num);
            }
            s.push(num);
        }
        int []ans=new int [n];
        for(int i=0;i<n;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;    
    }
}