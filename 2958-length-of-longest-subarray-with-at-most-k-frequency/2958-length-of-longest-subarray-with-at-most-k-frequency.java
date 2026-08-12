class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int l=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int r=0;r<n;r++){
            int c=nums[r];
            freq.put(c,freq.getOrDefault(c,0)+1);
            while(freq.get(c)>k){
                int d=nums[l];
                freq.put(d,freq.get(d)-1);
                l++;
            }
            max=Math.max(max,r-l+1);

        }
        return max;
    }
}