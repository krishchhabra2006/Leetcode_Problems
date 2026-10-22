class Solution {
    private int[] getNse(int[] arr){
        int n=arr.length;
        int []nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty() ?n:st.peek();
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
    private int[] getNge(int[] arr){
        int n=arr.length;
        int []nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            nge[i]=st.isEmpty() ?n:st.peek();
            st.push(i);
        }
        return nge;
    }
     private int[] getPge(int[] arr){
        int n=arr.length;
        int[] pge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();
            pge[i]=st.isEmpty() ? -1:st.peek();
            st.push(i);
        }
        return pge;
    }
    public long subArrayRanges(int[] arr) {
        long ans=0;
        int n=arr.length;
        int[] nse=getNse(arr);
        int[] pse=getPse(arr);
        int[] nge=getNge(arr);
        int[] pge=getPge(arr);
        for(int i=0;i<n;i++){
            long sub=(nse[i]-i)*(i-pse[i]);
            long add=(nge[i]-i)*(i-pge[i]);
            ans+=add*(long)arr[i];
            ans-=sub*(long)arr[i];
        }
        return ans;


        
        




        
    }
}