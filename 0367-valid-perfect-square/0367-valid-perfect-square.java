class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1,r=num;
        while(l<=r)
        {
            int m=(l+r)/2;
            long a=(long)m*m;
            if(a==num)
            return true;
            else if(a<num)
            l=m+1;
            else 
            r=m-1;
        }
        return false;
    }
}