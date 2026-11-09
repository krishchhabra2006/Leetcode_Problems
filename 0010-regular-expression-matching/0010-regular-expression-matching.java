class Solution {
    private boolean func(String s, String p, int i, int j, int n, int m) {
        if(j>=m) return i>=n;
        boolean check=(i<n && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));
        if(j+1<m && p.charAt(j+1)=='*'){
            return (func(s,p,i,j+2,n,m) || (check && func(s,p,i+1,j,n,m)));
        } 
        else{
            return (check && func(s,p,i+1,j+1,n,m));
        }
    }
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        return func(s,p,0,0,n,m);
    }
}