class Solution {
    public char nextGreatestLetter(char[] le, char target) {
        int n=le.length;
        int l=0;
        int h=le.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(le[mid]<=target){
                l=mid+1;
            }
            else h=mid-1;

        }
        return le[l%n];
        
        
    }
}