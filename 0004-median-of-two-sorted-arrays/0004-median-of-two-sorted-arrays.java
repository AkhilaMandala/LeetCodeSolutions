class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int m=nums1.length;
        int[] merge=new int[m+n];
        for(int i=0;i<m+n;i++)
        {
            if(i<m)
            merge[i]=nums1[i];
            else
            merge[i]=nums2[i-m];
        }
        double median;
        Arrays.sort(merge);
        if((merge.length%2)==1)
        {
        median=merge[merge.length/2];}
        else
        {
        int x=merge.length/2;
        int y=(merge.length/2)-1;
         median=(merge[x]+merge[y])/2.0;
        }
        return median;
    }
}