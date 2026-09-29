class Solution {
    public int[] numberGame(int[] nums) {
        int  n=nums.length;
        Arrays.sort(nums);
        int []arr=new int[n];
        int i=0;
        int j=1;
        int k=0;
        while(i<n && j<n){
            arr[k++]=nums[j];
            arr[k++]=nums[i];
            i+=2;
            j+=2;

        }
        return arr;
        
    }
}