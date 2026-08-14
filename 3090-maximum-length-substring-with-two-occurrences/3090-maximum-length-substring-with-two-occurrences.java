class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<>();
        int j=0,res=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.get(c)>2){
                char l=s.charAt(j);
                mp.put(l,mp.get(l)-1);
                j++;
            }
            res=Math.max(res,i-j+1);      
        }
        return res;
    }
}