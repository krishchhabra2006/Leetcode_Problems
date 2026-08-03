class Solution {
public:
    int singleNumber(vector<int>& nums) {
         int ans=0;
         int n=nums.size();
          for(int i=0;i<32;i++){
             long long ele=(1LL<<i);
              int count=0;
              for(int j=0;j<n;j++){
               if((nums[j]&ele))count++;
              }
               if(count%3)ans+=ele;
          }
          return ans;
    }
};