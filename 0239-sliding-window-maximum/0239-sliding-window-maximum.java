class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> d=new ArrayDeque<>();
        int[]res =new int[n-k+1];
        int idx=0;
        for(int i=0;i<n;i++){
            if(!d.isEmpty() && d.peekFirst()<i-k+1){
                d.pollFirst();
            }
            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.pollLast();
            }
            d.offerLast(i); 
            if(i>=k-1){
                res[idx++]=nums[d.peekFirst()];
            }    
        }
        return res;
        
    }
}