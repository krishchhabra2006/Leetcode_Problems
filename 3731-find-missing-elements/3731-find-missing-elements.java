class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minVal=Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        Set<Integer> set =new HashSet<>();
        for(int num:nums) {
            minVal=Math.min(minVal,num);
            maxVal=Math.max(maxVal,num);
            set.add(num);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=minVal;i<=maxVal;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}