class Solution {
    public int minimumPushes(String word) {
        int tp=0;
        int n=word.length();
        for(int i=0;i<n;i++){
            tp+=(i/8)+1;
        }
        return tp;  
    }
}