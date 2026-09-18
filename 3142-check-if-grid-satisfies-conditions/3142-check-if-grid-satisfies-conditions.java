class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        
        for(int i=0;i<c;i++){
            int down=grid[0][i];
            for(int j=0;j<r;j++){
                if(grid[j][i]!=down) return false;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j+1<c){
                    if(grid[i][j]==grid[i][j+1]) return false;
                }
                
            }
        }
        return true;
    }
}