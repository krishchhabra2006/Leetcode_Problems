class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int five=0,ten=0;
        for(int i:bills){
            if(i==5) five++;
            else if(i==10) {
                if(five>=1){
                    five--;
                    ten++;
                }
                else{
                    return false;

                }
            }
            else{
                if(five>=1 && ten>=1){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else return false;
            }
        }
        return true;

        
    }
}