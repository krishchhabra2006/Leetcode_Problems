class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        int ans=0;
        for(int i=1;i<n;i++){
            while(nums[i]-nums[l]>1){
                l++;
            }
            if(nums[i]-nums[l]==1) {
                ans=Math.max(ans,i-l+1);
            }
        }
        return ans;

        
    }
}