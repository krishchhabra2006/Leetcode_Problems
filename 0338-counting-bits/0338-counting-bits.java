class Solution {
    public int bits(int n){
        int count=0;
        while(n>1){
            count+=n&1;
            n>>=1;
        }
        if(n==1) return count+1;
        return count;

    }
    public int[] countBits(int n) {
        int []arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=bits(i);
        }
        return arr;

        
    }
}