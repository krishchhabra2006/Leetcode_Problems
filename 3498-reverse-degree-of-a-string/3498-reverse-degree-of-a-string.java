class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int ans=0;
        int sum=0;
        for(int i=0;i<n;i++){
            ans=(i+1)*('z'-s.charAt(i)+1);
            sum+=ans;
        }
        return sum;    
    }
}