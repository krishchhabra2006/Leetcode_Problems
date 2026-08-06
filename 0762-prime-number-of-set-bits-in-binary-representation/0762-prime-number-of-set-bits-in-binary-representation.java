class Solution {
    public boolean prime(int n){
        if(n==0 || n==1) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int setBits=Integer.bitCount(i);
            if(prime(setBits)) ans++;
        }
        return ans;  
    }
}