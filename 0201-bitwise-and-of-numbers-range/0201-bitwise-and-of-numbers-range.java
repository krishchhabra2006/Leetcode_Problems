class Solution {
    public int rangeBitwiseAnd(int l, int r) {
        int count=0;
        boolean flag=false;
        for(int i=0;i<31;i++){
            long ele=(1<<i);
            if((long)(r-l+1)<=ele){
                flag=true;
                if((l&ele)==0 || (r&ele)==0) flag=false;
                if(flag) count+=ele;
            }
        }
        return count;
      
    }
}