class Solution {
public:
    int rangeBitwiseAnd(int l, int r) {
         int ans=0;
        for(int i=0;i<31;i++){
             long long ele=(1LL<<i);
             if((long long)r-l+1<=ele){
                 bool check=true;
                if(  (l&ele)==0 || (r&ele)==0  )check=false;
                 if(check)ans+=ele;
             }
        }
         return ans;
    }
};