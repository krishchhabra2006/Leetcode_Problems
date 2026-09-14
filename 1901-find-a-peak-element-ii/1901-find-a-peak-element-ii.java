class Solution {
    public int findmaxrow(int mat[][],int n,int col){
        int maxvalue=-1;
        int maxidx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>maxvalue){
                maxvalue=mat[i][col];
                maxidx=i;
            }
        }
        return maxidx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int l=0;
        int r=m-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int maxrowidx=findmaxrow(mat,n,mid);
            int left=(mid-1>=0)? mat[maxrowidx][mid-1]:-1;
            int right=(mid+1<m)? mat[maxrowidx][mid+1]:-1;
            if(mat[maxrowidx][mid]>left && mat[maxrowidx][mid]>right) return new int[]{maxrowidx,mid};
            else if(mat[maxrowidx][mid]<right) l=mid+1;
            else r=mid-1;  
        }

        return new int[]{-1,-1};

    }
}