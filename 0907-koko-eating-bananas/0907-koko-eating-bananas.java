import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        if(n==0)return 0;
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int ans=r;
        //gives the maximum element in the array....
        while(l<=r)
        {
            int m=(l+r)/2;
            int time=totalTime(piles,m);
            if(time<=h)
            {
              ans=m;
              r=m-1;
            }
            else l=m+1;
        }
        return ans;
    }
    public static int totalTime(int[] arr,int m)
    {
        int totalT=0;
        for(int i=0;i<arr.length;i++)
    {
     totalT+=Math.ceil((double)arr[i]/m);
    }
    return totalT;
    }
}