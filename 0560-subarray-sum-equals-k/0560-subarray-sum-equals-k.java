class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int x:nums){
            sum+=x;
            int rem=sum-k;
            if(mp.containsKey(rem)){
                count+=mp.get(rem);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;   
    }
}