class Solution {
    public boolean checkDivisibility(int n) {
        int ori=n;
        int Sum=0;
        int Prod=1;
        while(n>0){
            int digit=n%10;
            Sum+=digit;
            Prod*=digit;
            n/=10;
        }
        int div=Sum+Prod;
        return ori%div==0;
        
    }
}