class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int []a=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                a[i]=count%2; 
                count++;   
            }
            else {
                count--;
                a[i]=count%2;
            }
        }
        return a;     
    }
}