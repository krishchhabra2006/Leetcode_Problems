class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> arr=new ArrayList(mp.entrySet());
        arr.sort((a,b)->b.getValue()-a.getValue());
        int [] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i).getKey();
        }
        return res;

    }

        
        
}