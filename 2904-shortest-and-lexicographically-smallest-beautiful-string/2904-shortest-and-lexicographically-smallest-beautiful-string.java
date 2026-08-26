class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count=0;
        int i=0;
        int j=0;
        String ans="";
        int n=s.length();
        int length=n + 1;
        while(j<n){
            if(s.charAt(j)=='1'){
                count++;
            }
            while(count>k){
                if(s.charAt(i)=='1'){
                    count--;
                }
                i++;
            }
            while(s.charAt(i)=='0' && count==k) {
                i++;
            }
            if(count==k){
                String sub=s.substring(i, j + 1);
                int currentLen =j-i+1;

                if(currentLen<length){
                    length=currentLen;
                    ans=sub;
                } 
                else if(currentLen==length){
                    if (sub.compareTo(ans)<0){
                        ans = sub;
                    }
                }
                if(s.charAt(i) == '1'){
                    count--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}