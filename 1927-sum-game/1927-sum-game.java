class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int half=n/2;
        int qL=0;
        int qR=0;
        int diff=0;
        for (int i=0;i<n;i++) {
            char ch=num.charAt(i);
            if (i < half) {
                if (ch == '?') {
                    qL++;
                } else {
                    diff += ch - '0';
                }
            } 
            else {
                if (ch == '?') {
                    qR++;
                } else {
                    diff -= ch - '0';
                }
            }
        }
        if ((qL + qR) % 2 != 0) {
            return true;
        }
        int temp = 9 * (qR - qL) / 2;
        return diff != temp;
    }
}