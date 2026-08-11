class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else break;
            
        }
        while(s.contains(sum)) sum++;
        return sum;


        
    }
}