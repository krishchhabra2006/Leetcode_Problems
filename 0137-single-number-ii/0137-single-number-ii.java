class Solution {
    public int singleNumber(int[] nums){
        int n=nums.length;
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            int ele=(1<<i);
            for(int j=0;j<n;j++){
                if((nums[j] & ele)==0 )count++;
            }
            if(count%3==0) ans+=ele;
        }
        return ans;  
    }
}
