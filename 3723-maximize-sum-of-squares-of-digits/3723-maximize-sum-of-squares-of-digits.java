class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder s=new StringBuilder();
        if(9*num<sum) return "";
        for(int i=0;i<num;i++){
            int digit=Math.min(9,sum);
            sum-=digit;
            s.append(digit);
        }
        return s.toString();
        
    }
}