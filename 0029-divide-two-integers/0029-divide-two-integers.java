class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend==divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor==1) return dividend;
        if (divisor ==-1) return -dividend;
        boolean isPositive =(dividend>0 == divisor>0);
        long n=Math.abs((long) dividend);
        long d=Math.abs((long) divisor);
        int ans=0;
        while (n>=d){
            long tempDivisor=d;
            long count=1;
            while(n >=(tempDivisor <<1)){
                tempDivisor <<=1;
                count <<=1;
            }
            n-=tempDivisor;
            ans+=count;
        }
        return isPositive ? ans:-ans;
    }
}