class Solution {
    public boolean canminimize(int []nums, int mid,int k){
        int currentsum=0;
        int subarray=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>mid) return false;
            if(currentsum+nums[i]>mid){
            subarray++;
            currentsum=nums[i];
            if(subarray>k) return false;
            }
            else currentsum+=nums[i];

        }
        return true;

    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int l=0;
        int h=sum;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(canminimize(nums,mid,k)){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;


        
    }
}