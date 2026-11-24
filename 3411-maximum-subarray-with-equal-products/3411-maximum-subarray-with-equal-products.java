class Solution {
    private long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    private long lcm(long a, long b){
        if(a==0 || b==0){
            return 0;
        }
        return (a/gcd(a,b))*b;
    }
    public int maxLength(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i = 0; i < n; i++){
            long prod=1;
            long gcd=0;
            long lcm=1;
            for(int j=i;j<n;j++){
                prod*=(long)nums[j];
                gcd=gcd(gcd, (long)nums[j]);
                lcm=lcm(lcm, (long)nums[j]);
                if(prod==gcd*lcm){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}