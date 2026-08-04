class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int maxi=0;
        int l=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            maxi=Math.max(maxi,i-l+1);     
        }
        return maxi;
        
    }
}