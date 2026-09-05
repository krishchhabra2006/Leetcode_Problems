class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int i:piles) max=Math.max(max,i);
        while(min<max){
            int mid=min+(max-min)/2;
            int hours=0;
            for(int i:piles){
                hours+=(i+mid-1)/mid;
            }
            if(hours>h) min=mid+1;
            else max=mid;    
        }
        return min;     
    }
}