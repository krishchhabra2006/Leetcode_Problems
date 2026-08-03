class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char current=s.charAt(i);
            if(map.containsKey(current)){
                left=Math.max(left,map.get(current)+1);
            }
            map.put(current,i);
            max=Math.max(max,i-left+1);   
        }
        return max;    
    }
}