class Solution {
    public double minPrice(int[] p, int[] d) {
        int n=p.length;
        int m=d.length;
        Arrays.sort(p);
        Arrays.sort(d);
        double sum=0;
        int j=m-1;
        for(int i=n-1;i>=0;i--){
            if(j>=0){
                double res=p[i]*(100-d[j])/100.0;
                sum+=res;
                j--;
            }
            else{
                sum+=p[i];
            }

        }
        return sum;

        
    }
}