class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int total=10;
        int move=0;
        while(n>=total){
            n-=total;
            total--;
            move++;   
        }
        if(move%2==1) return true;
        return false;    
    }
}