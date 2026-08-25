class Solution {
    public int missingMultiple(int[] nums,int k){
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        for(int x:nums){
            s.add(x);
        }
        int temp=k;
        while(s.contains(temp)){
            temp+=k;
        }
        return temp;



    }
}