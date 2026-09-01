import java.util.*;
class Solution{
    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        int m=nums1.length,n=nums2.length;
        int[]res=new int[m+n];
        System.arraycopy(nums1,0,res,0,m);
        System.arraycopy(nums2,0,res,m,n);
        Arrays.sort(res);
        int len=res.length;
        int mid=len/2;
        if(len%2==0) return(res[mid]+res[mid-1])/2.0;
        else return res[mid];
    }
}