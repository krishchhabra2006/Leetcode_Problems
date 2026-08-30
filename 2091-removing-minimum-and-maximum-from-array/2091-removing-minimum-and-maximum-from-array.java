class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIndex =0;
        int maxIndex = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minIndex]) minIndex=i;
            if(nums[i]>nums[maxIndex]) maxIndex=i;
        }
        int l=Math.min(minIndex,maxIndex);
        int r=Math.max(minIndex,maxIndex);
        int front=r+1;
        int back=n-l;
        int frontBack=(l+1)+(n-r);
        return Math.min(front,Math.min(back,frontBack));
    }
}