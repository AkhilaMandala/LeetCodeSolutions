class Solution {
    public int squaren(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=squaren(slow);
        while(fast!=1 && fast!=slow)
        {
            slow=squaren(slow);
            fast=squaren(squaren(fast));
        }
        return fast==1;
    }
}