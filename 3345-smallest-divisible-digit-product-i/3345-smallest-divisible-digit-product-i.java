class Solution {
    public static int prod(int n){
        int prod=1;
        while(n!=0){
            int digit=n%10;
            prod*=digit;
            n/=10;

        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        int low=n;
        while(true){
            if(prod(low)==0) return low;
            if(prod(low)%t==0) return low;
            else low=low+1;
        
        }  
    }
}