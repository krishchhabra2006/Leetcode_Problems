class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long sum1=0;
        long sum2=0;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            sum2+=nums[i];
            long temp=sum1-sum2;
            if(sum2>=temp){
                count++;
            }
            
        }
        return count;



    }
}