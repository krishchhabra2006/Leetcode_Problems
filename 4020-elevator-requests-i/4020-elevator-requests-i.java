class Solution {
    public int elevatorRequests(int n, int[] req) {
        int x=req.length;
        int res=req[0];
        for(int i=0;i<x-1;i++){
            res+=Math.abs(req[i]-req[i+1]);
        }
        return res;
        
    }
}