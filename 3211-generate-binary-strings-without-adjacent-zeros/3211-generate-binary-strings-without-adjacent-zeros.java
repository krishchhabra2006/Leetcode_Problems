class Solution {
    public List<String> validStrings(int n) {
        List<String> l=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        f(n,0,l,sb);
        return l;   
    }
    void f(int n,int idx,List<String> l,StringBuilder sb){
        if(idx==n){
            if(isValid(sb.toString())){
                l.add(sb.toString());
            }
            return;
        }
        sb.append(0);
        f(n,idx+1,l,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append(1);
        f(n,idx+1,l,sb);
        sb.deleteCharAt(sb.length()-1);
    }
    boolean isValid(String s){
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(i);
            if(j-i+1==2){
                if(!s.substring(i,j+1).contains("1")) return false;
                i++;
            }
            j++;
        }
        return true;
    }
}

