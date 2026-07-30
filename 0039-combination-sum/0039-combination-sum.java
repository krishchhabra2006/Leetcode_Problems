class Solution {
    public static void printS(int ind,List<List<Integer>> l,List<Integer> ds,int s,int sum,int []arr,int n){
        
        if(s==sum){
            l.add(new ArrayList<>(ds));
            return;       
        }
        if(s>sum || ind==n) return;
        ds.add(arr[ind]);
        s+=arr[ind];
        printS(ind,l,ds,s,sum,arr,n);
        s-=arr[ind];
        ds.remove(ds.size()-1);
        printS(ind+1,l,ds,s,sum,arr,n);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        printS(0,l,ds,0,target,candidates,candidates.length);
        return l;





        
    }
}