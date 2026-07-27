class Solution {
    public int[] platesBetweenCandles(String s, int[][] nums) {
        int n=s.length();
        int numq=nums.length;
        int nearestleftcandle[]=new int[n];
        int nearestrightcandle[]=new int[n];
        int candlecount[]=new int[n];
        int ans[]=new int[numq];
        int candle=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                candle=i;
            }
            nearestleftcandle[i]=candle;
        }
        candle=-1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='|'){
                candle=i;
            }
            nearestrightcandle[i]=candle;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                count++;    
            }
            candlecount[i]=count;
        }
        int idx = 0;
        for(int[] query:nums){
            int left=query[0];
            int right=query[1];
            int leftCandle=nearestrightcandle[left];
            int rightCandle=nearestleftcandle[right];
            int d=0;
            if(leftCandle==-1 || rightCandle==-1 || leftCandle >=rightCandle){
                ans[idx]=0;
            } 
            else{
                ans[idx] = (rightCandle - leftCandle)-(candlecount[rightCandle]-candlecount[leftCandle]);
            }
            ++idx;
        }

        return ans;




        
    }
}