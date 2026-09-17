class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;
        int i=0;
        while(i<=maxReach && i<nums.length){
            maxReach=Math.max(maxReach,i+nums[i]);
            i++;
        }
        return maxReach>=nums.length-1;
    }
}
