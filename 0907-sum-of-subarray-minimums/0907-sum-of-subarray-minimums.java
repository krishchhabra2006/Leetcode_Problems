import java.util.Stack;
class Solution {
    private int[] getNse(int[] arr) {
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i]=st.isEmpty() ? n:st.peek();
            st.push(i);
        }
        return nse;
    }                                                   
    private int[] getPse(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
                st.pop();
            pse[i]=st.isEmpty() ? -1:st.peek();
            st.push(i);
        }
        return pse;
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] nse=getNse(arr);
        int[] pse=getPse(arr);
        long total=0;
        int MOD=1_000_000_007;
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            long ways=(left*right)%MOD;
            long currentSum=(ways*arr[i])%MOD;
            total=(total+currentSum)%MOD;
        }
        return (int) total;
    }
}