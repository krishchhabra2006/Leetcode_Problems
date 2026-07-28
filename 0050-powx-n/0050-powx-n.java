class Solution {
    static double helper(double x,long n){
        if(x==0) return 0;
        if(n==0) return 1;
        double res=helper(x,n/2);
        res=res*res;
        if(n%2==1) return x*res;
        else return res;
    }
    public double myPow(double x, int n) {
        long N=n;
        double res=helper(x,Math.abs(N));
        if(N>=0) return res;
        else return 1/res;
    }
}

