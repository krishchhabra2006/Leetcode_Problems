class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int []pref_sum=new int[n+1];
       
        for(int i=1;i<=n;i++){
            int val=nums[i-1]==1? 1:-1;
            pref_sum[i]=pref_sum[i-1]+val;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxi=0;
        for(int i=0;i<=n;i++){
            if(mp.containsKey(pref_sum[i])){
                maxi=Math.max(maxi,i-mp.get(pref_sum[i]));

            }
            else {
                mp.put(pref_sum[i],i);
            }

        }
        return maxi;

    }
}