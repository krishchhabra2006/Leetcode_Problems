class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        if(k<0) return 0;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>entry :mp.entrySet()){
            if(k==0){
                if(entry.getValue()>1){
                    ans++;
                }
            }
            else if(mp.containsKey(entry.getKey()+k)) {
                ans++;
            }
        }
        return ans;
    }
}