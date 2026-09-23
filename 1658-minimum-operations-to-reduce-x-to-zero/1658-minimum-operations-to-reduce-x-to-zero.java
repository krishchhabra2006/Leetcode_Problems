class Solution {
    public int minOperations(int[] nums,int x){
        int n=nums.length;
        int sum=-x;
        for(int a:nums) sum+=a;
        if(sum<0) return -1;
        if(sum==0) return n;
        int i=0,s=0,best=-1;
        for(int j=0;j<n;j++){
            s+=nums[j];
            while(s>sum){
                s-=nums[i++];
            }
            if(s==sum) best=Math.max(best,j-i+1);
        }
        return best<0 ?-1:n-best;

        

           
        
    }
}