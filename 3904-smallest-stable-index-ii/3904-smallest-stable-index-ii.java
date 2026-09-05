class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        if(n==0) return -1;
        int []suf=new int[n];
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--) suf[i]=Math.min(suf[i+1],nums[i]);
        int maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxSoFar=Math.max(maxSoFar, nums[i]);
            if((long)maxSoFar<=(long)k+suf[i])
                return i;
        }
        return -1;
    }
}